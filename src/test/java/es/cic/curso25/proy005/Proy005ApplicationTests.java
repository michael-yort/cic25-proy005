package es.cic.curso25.proy005;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
//MIRARLO!!
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

//Entenderlo
@SpringBootTest
@AutoConfigureMockMvc
class Proy005ApplicationTests {

	@Autowired
	private MockMvc mockMvc;
//MockMvc es un objeto de test que si pasa por casi todas las piezas de mi codigo.
//MockMvc simula todo el flujo desde el navegador hasta el controlador.
	@Test
	void testTelefonoDelete() throws Exception{
		mockMvc.perform(delete("/telefono/4"))
		.andDo(print())
		.andExpect(status()
		.isOk()).andReturn();

	}


//-------------------------------//


	@Test
	void testLista() {

		ArrayList miLista = new ArrayList();

		miLista.add("Hola mundo");

		String contenido = (String) miLista.get(0);

		//////////////////////////////////////////

		ArrayList<String> miSegundaLista = new ArrayList<>();
		miSegundaLista.add("Mi mensaje");

		String mensajeOriginal = miSegundaLista.get(0);

	}

}
