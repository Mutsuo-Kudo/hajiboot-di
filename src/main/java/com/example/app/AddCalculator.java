/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.app;

import org.springframework.stereotype.Component;

/**
 *
 * @author mukudo
 */
@Component
public class AddCalculator implements Calculator {

    @Override
    public int calc(int a, int b) {
        return a + b;
    }
}
