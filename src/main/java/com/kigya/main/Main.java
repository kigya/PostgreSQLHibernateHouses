package com.kigya.main;

import com.kigya.service.impl.HouseServiceImpl;
import lombok.extern.log4j.Log4j2;

import javax.transaction.*;

@Log4j2
public class Main {


    public static void main(String[] args) throws SystemException {
        HouseServiceImpl service = new HouseServiceImpl();
        System.out.println(service.findAll());

    }


}

