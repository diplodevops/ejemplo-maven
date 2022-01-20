package com.devopsusach2020;

import com.devopsusach2020.model.Mundial;
import com.devopsusach2020.model.Pais;
import com.devopsusach2020.rest.RestData;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
class DevOpsUsach2020ApplicationTests {
    RestData restData = new RestData();

    @Test
    void contextLoads() {
        // RestData restData = new RestData();
        Pais response = restData.getData("HOLA devops");
        assertEquals("Mensaje Recibido: HOLA devops", response.getMensaje());
    }

    @Test
    void getTotalPaisTest() {
        Pais response = restData.getTotalPais("chile");
        assertEquals("ok", response.getMensaje());
    }

    @Test
    void getTotalMundialTest() {
        Mundial response = restData.getTotalMundial();

        System.out.println("RES: " + response);
    }

    @Test
    void getTotalMundialTest2() {
        Mundial response = restData.getTotalMundial();

        System.out.println("RES: " + response);
    }
}
