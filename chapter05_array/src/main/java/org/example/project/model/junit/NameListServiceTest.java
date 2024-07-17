package org.example.project.model.junit;

import org.example.project.model.service.NameListService;
import org.example.project.model.service.TeamException;
import org.example.project.model.view.TSUtility;
import org.testng.annotations.Test;

public class NameListServiceTest {
    @Test
    void testKeyBoard(){
        System.out.println(TSUtility.readKeyBoard(1, false));
    }
    @Test
    void testAllEmployee(){
        NameListService nameListService = new NameListService();
        for (int i = 0; i < nameListService.getAllEmployees().length; i++) {
            System.out.println(nameListService.getAllEmployees()[i]);
        }
        System.out.println(nameListService.getAllEmployees());

    }
}
