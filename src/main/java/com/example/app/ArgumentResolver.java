/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.app;

import java.io.InputStream;

/**
 *
 * @author mukudo
 */
public interface ArgumentResolver {

    Argument resolve(InputStream stream);
}
