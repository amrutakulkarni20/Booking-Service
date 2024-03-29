package com.statista.code.challenge.util;
import com.statista.code.challenge.model.BookingModel;
import com.statista.code.challenge.model.BusinessModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SingletonBookingMap {
    private static SingletonBookingMap instance;
    private Map<Integer, BookingModel> bookingMap;

    private Map<String, List<Integer>> departmentMap;

    private Map<String, Double> currencyMap;

    private Map<Integer, BusinessModel> businessMap;

    private  Map<Integer, BusinessModel> businessReport;

    private SingletonBookingMap() {
        bookingMap = new HashMap<>();
        departmentMap = new HashMap<>();
        currencyMap = new HashMap<>();
        businessMap = new HashMap<>();
        businessReport = new HashMap<>();
    }

    public static synchronized SingletonBookingMap getInstance() {
        if (instance == null) {
            instance = new SingletonBookingMap();
        }
        return instance;
    }

    public Map<Integer, BookingModel> getBookingMap() {
        return bookingMap;
    }

    public Map<String, List<Integer>> getDepartmentMap() {
        return departmentMap;
    }

    public Map<String, Double> getCurrencyMap() {
        return currencyMap;
    }

    public Map<Integer, BusinessModel> getBusinessMap(){return businessMap;}

    public Map<Integer, BusinessModel> getBusinessReport() {return businessReport;  }
}
