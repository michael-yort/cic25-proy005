package es.cic.curso25.proy005;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TelefonoControllerTests {
/*Autowired simula un objeto TelefonoController y permite
 hacer un test que no empieza desde desde e navegador.
*/
    @Autowired
    private TelefonoController telefonoController;

    @Test
    public void testCreate(){
        long resultadoId = telefonoController.create(null);
        assertTrue(resultadoId > 0);
    }
}
