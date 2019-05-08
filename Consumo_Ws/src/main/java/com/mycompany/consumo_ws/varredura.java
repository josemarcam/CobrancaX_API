/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.consumo_ws;

import java.io.File;
import org.apache.http.HttpRequest;

/**
 *
 * @author josemartins
 */
public class varredura {
    public String varrer(String caminho, String extensao) throws Exception{
        HttoRequest u = new HttoRequest();
       String extensaom = extensao.toUpperCase();
        File file = new File(caminho);
                for (String arquivos : file.list()) {
			if (arquivos.endsWith(extensao) | arquivos.endsWith(extensaom) ) {
                            File c = new File(caminho+"/"+arquivos);
                            System.out.println(c);
                            u.uploadFile("http://cobrancax.com.br:8080/rem",c);
                        } else {
			}
		}
        return caminho;
    }
}
