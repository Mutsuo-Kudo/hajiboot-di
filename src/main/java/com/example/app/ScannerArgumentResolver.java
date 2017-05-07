/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.app;

import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author mukudo
 */
@Component
public class ScannerArgumentResolver implements ArgumentResolver {

    @Override
    public Argument resolve(InputStream stream) {
        Scanner scanner = new Scanner(stream);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
        int a = 100;
        int b = 200;
        return new Argument(a, b);
//        return null;
    }
}
