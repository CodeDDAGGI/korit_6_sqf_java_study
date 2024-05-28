package com.study.java_study.ch09_클래스04;

public class CarInfo {
    private int carNumber;
    private CarEntity[] cars;

    public CarInfo() {
        cars = new CarEntity[0]; // cars : CarEntity[]를 수식하는 배열 공간 전달
    }

    public int incrementCarNumber() {
        return ++carNumber; // id는 0부터 시작하니까 1증가
        // 차 넘버를 등록할때마다 +1씩 증가
    }

    private void extendCars() {
        CarEntity[] newCars = new CarEntity[cars.length + 1];
        for (int i = 0; i< cars.length; i++) {
            newCars[i] = cars[i];
        }
        cars = newCars;
    }

    private int lastIndex () {
        return cars.length - 1;
    }

    public void saveCar(CarEntity car){
        // 배열을 확장 해주고
        extendCars();

        cars[lastIndex()] = car; // cars의 마지막 인덱스에 car의 값들을 전달
    }

    public CarEntity findByCar (int carNumber, String carName){
        CarEntity findCar = null;
        for (CarEntity car: cars){
            if(car.getCarName().equals(carName) || car.getCarNumber() == carNumber){
                findCar = car;
                break;
            }

        }
        return findCar;
    }
    private int newArraySize (int number, String text) {
        int newArraySize = 0;

        switch (number) {
            case 1:
                for(CarEntity car : cars){
                    if(car.getCarName().contains(text)
                        || car.getCarNumber() == carNumber
                        || car.getCarBrand().contains(text)) {
                        newArraySize++;
                    }
                }
                break;
            case 2:
                for(CarEntity car : cars) {
                    if (car.getCarName().contains(text)){
                        newArraySize++;
                    }
                }
                break;
            case 3:
                for(CarEntity car : cars) {
                    if (car.getCarNumber() == carNumber){
                        newArraySize++;
                    }
                }
                break;
            case 4:
                for (CarEntity car : cars) {
                    if (car.getCarBrand().contains(text)){
                        newArraySize++;
                    }
                }
        }
        return newArraySize;
    }

    public CarEntity[] searchCars (int number, String text){
        int ArraySize = newArraySize(number, text);

        CarEntity[] searchCars = new CarEntity[ArraySize];
        int i = 0;
        switch (number){
            case 1 :
                    for(CarEntity car : cars) {
                        if (car.getCarName().contains(text)
                                || (car.getCarNumber() == carNumber)
                                || car.getCarBrand().contains(text)) {
                            searchCars[i] = car;
                            i++;
                        }
                    }
                break;
            case 2 :
                for(CarEntity car : cars) {
                    if (car.getCarName().contains(text)) {
                        searchCars[i] = car;
                        i++;
                    }
                }
                break;
            case 3 :
                for(CarEntity car : cars) {
                    if (car.getCarNumber() == carNumber) {
                        searchCars[i] = car;
                        i++;
                    }
                }
                break;
            case 4 :
                for(CarEntity car : cars) {
                    if (car.getCarBrand().contains(text)) {
                        searchCars[i] = car;
                        i++;
                    }
                }
           }
        return searchCars;
    }
}

