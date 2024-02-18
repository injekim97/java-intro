package cond.ex;

public class DistanceEx {

    public static void main(String[] args) {

        String transport;

        int distance = 50;
        if (distance <= 1) {
            transport = "도보";
        } else if (distance <= 10) {
            transport = "자전거";
        } else if (distance <= 100) {
            transport = "자동차";
        } else {
            transport = "비행기";
        }

        System.out.println("distance: " + distance);
        System.out.println("출력: " + transport + "를 이용하세요.");

    }
}