package com.study.dvd.dao;

import com.study.dvd.db.DBConnectionMgr;
import com.study.dvd.entity.DVD;
import com.study.dvd.entity.Producer;
import com.study.dvd.entity.Publisher;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DVDDao {

    public static int addDvd(DVD dvd) {
        DBConnectionMgr pool = DBConnectionMgr.getInstance(); // 싱글톤

        Connection connection = null; // 데이터 베이스를 연결해주는 객체
        PreparedStatement preparedStatement = null;
        int successCount = 0;

        try { // 로그인 실패나 접속 실패시에 프로그램 종료를 방지
            connection = pool.getConnection(); // 데이터베이스 연결 ( getConnection 호출될때마다 게속 값을 넣어줘야댐)
            String sql = "insert into dvd_tb values(0, ?, ?, ?, ?, ?, now())"; // 문법 ?마다 1,2,3,4,5
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, dvd.getRegistrationNumber());
            preparedStatement.setString(2, dvd.getTitle());
            preparedStatement.setInt(3, dvd.getProducer().getProducerId());
            preparedStatement.setInt(4, dvd.getPublisher().getPublisherId());
            preparedStatement.setInt(5, dvd.getPublicationYear());
            successCount = preparedStatement.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            pool.freeConnection(connection, preparedStatement); //
        }

        return successCount;
    }

    public static int addProducer(Producer producer) {
        DBConnectionMgr pool = DBConnectionMgr.getInstance(); // 싱글톤

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet generatedKeys = null;
        int successCount = 0;

        try { // 로그인 실패나 접속 실패시에 프로그램 종료를 방지
            connection = pool.getConnection(); // 데이터베이스 연결
            String sql = "insert into producer_tb values(0, ?)"; // 문법 ?마다 1,2,3,4,5
            preparedStatement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS); // 미완성된 쿼리 실행시킬 준비 , 만들어진 키값을 가져올때(옵션)
            // RETURN_GENERATED_KEYS : db에 생성된 키값을 리턴(반홚)
            preparedStatement.setString(1, producer.getProducerName()); // ? 자리에 데이터 채우기  ? = ProducerName 쿼리 완성(한줄의 row)
            successCount = preparedStatement.executeUpdate(); // executeUpdate() : 쿼리 실행
            generatedKeys = preparedStatement.getGeneratedKeys(); // 쿼리 실행 문에서 키값을 가져옴 (ResultSet = select 표) 반환하는 자료형이 resultSet
            generatedKeys.next(); // 커서를 한 줄로 산텍
            producer.setProducerId(generatedKeys.getInt(1)); // 이동한 커서의 컬럼의 첫번째 키 값을 가져옴
        } catch (Exception e) {

        } finally {
            pool.freeConnection(connection, preparedStatement , generatedKeys);
        }

        return successCount;
    }

    public static int addPublisher(Publisher publisher) {
        DBConnectionMgr pool = DBConnectionMgr.getInstance(); // 싱글톤

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet generatedKeys = null;
        int successCount = 0;

        try { // 로그인 실패나 접속 실패시에 프로그램 종료를 방지
            connection = pool.getConnection(); // 데이터베이스 연결
            String sql = "insert into publisher_tb values(0, ?)"; // 문법 ?마다 1,2,3,4,5
            preparedStatement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS); // 미완성된 쿼리 실행시킬 준비
            preparedStatement.setString(1, publisher.getPublisherName()); // ? 자리에 데이터 채우기
            successCount = preparedStatement.executeUpdate(); // 쿼리 실행
            generatedKeys = preparedStatement.getGeneratedKeys(); // 키값을 가져옴
            generatedKeys.next(); // 제목 밑의 칸으로 이동
            publisher.setPublisherId(generatedKeys.getInt(1)); // 첫번째 컬럼의 값을 인트형으로 가져옴 generatedKeys.getInt(1)한번 더 쓸시 다음 id값을 가져옴

        } catch (Exception e) {
            e.printStackTrace(); // 에러 내용 출력
        } finally {
            pool.freeConnection(connection, preparedStatement , generatedKeys);
        }

        return successCount;
    }

    public static List<DVD> findAll(int count) {
        DBConnectionMgr pool = DBConnectionMgr.getInstance();
        Connection connection = null; // 널로 할당하고 정의만해둠 (2)
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<DVD> dvdList = new ArrayList<>();

        try{
            connection = pool.getConnection(); // 지역 변수라서 (1)
            String sql = "select * from dvd_view limit 0, ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, count);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){ // true면 행이동 false 멈춤
                System.out.println(resultSet.getString(3));
                Producer producer = Producer.builder()
                        .producerId(resultSet.getInt(4))
                        .producerName(resultSet.getString(5))
                        .build();
                Publisher publisher = Publisher.builder()
                        .publisherId(resultSet.getInt(6))
                        .publisherName(resultSet.getString(7))
                        .build();
                DVD dvd = DVD.builder()
                        .dvdId(resultSet.getInt(1))
                        .registrationNumber(resultSet.getString(2))
                        .title(resultSet.getString(3))
                        .producerId(producer.getProducerId())
                        .publisherId(publisher.getPublisherId())
                        .producer(producer)
                        .publisher(publisher)
                        .publicationYear(resultSet.getInt(8))
                        .databaseDeta(resultSet.getDate(9).toLocalDate()) // 데이트 타입으로 toLocalDate()이 바꿔줌
                        .build();
                dvdList.add(dvd);
                System.out.println(dvd);
            }
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            pool.freeConnection(connection);
        }

        return dvdList;
    }
    
}
