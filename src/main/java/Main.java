

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Animales[] animales = mapper.readValue(new File("src/animales.json"), Animales[].class);

        /*
        Quiero poder acceder todo el rato a mis datos en el json de la forma mas legible posible pensaba en algo como
        animales.getAtaque
         */
    }
}

/*ObjectMapper objectMapper = new ObjectMapper();
        Animales animales = objectMapper.readValue(new File("src/animales.json"), Animales.class);
        System.out.println(animales.getNombre());*/

        /*String jsonCarArray =
                "[{ \"color\" : \"Black\", \"type\" : \"BMW\" }, { \"color\" : \"Red\", \"type\" : \"FIAT\" }]";
        ObjectMapper objectMapper = new ObjectMapper();
        List<Car> listCar = objectMapper.readValue(jsonCarArray, new TypeReference<List<Car>>(){});
        System.out.println(listCar.get(0).getColor());*/

