/* 
 * Copyright 2019 Javier Monterde - javier.monterde.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Javier Monterde - javier.monterde.alum@iescamp.es
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
        //Constantes
        final String NOMBRE_AMO = "Sócrates";
        final String MSG_SI = "¡Ave César!";
        final String MSG_NO = "¡Sócrates socorro!";

        //variables
        String mensajeLoro;
        String nombrePersona;

        //Salida inicial
        System.out.println("Alternativa Loro");
        System.out.println("================");
        System.out.println("---");

        //Comprobamos que ha escrito "Sócrates" (key sensitive)
        System.out.print("Persona que se acerca ..: ");
        nombrePersona = SCN.nextLine();

        if (nombrePersona.equals(NOMBRE_AMO)) {
            mensajeLoro = MSG_SI;
        } else {
            mensajeLoro = MSG_NO;
        }

        //Salida final
        System.out.printf("Dueño del loro ........: %s%n",
                NOMBRE_AMO);
        System.out.println("---");
        System.out.printf("Mensaje Loro ..........: %s%n",
                mensajeLoro);
    }
}
