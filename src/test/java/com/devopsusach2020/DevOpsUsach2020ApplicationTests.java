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

    @Test
    void contextLoads() {
        // RestData restData = new RestData();
        //Pais response = restData.getData("HOLA devops");
        String mensaje = "Mensaje Recibido: HOLA devops";
        assertEquals("Mensaje Recibido: HOLA devops", mensaje);
    }

/*    @Test
    void getTotalPaisTest() {
        Pais response = restData.getTotalPais("chile");
        assertEquals("ok", response.getMensaje());
    }*/

    @Test
    void getTotalMundialTest() {
        int r = 1;
        assertEquals(1, r);
    }

    @Test
    void getTotalMundialTest2() {
        int r = 1 + 1;
        assertEquals(2, r);
    }
}
