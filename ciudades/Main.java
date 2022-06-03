import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        //Se crena las Cidades con el almacen y las ventas
        Ciudad c1 = new Ciudad("Tokio", "Tumoto Tachida", "Enero", 10000);
        Ciudad c2 = new Ciudad("Tokio", "Tumoto Tachida", "Febrero", 8000);
        Ciudad c3 = new Ciudad("Tokio", "Mesako Mimoko", "Enero", 12000);
        Ciudad c4 = new Ciudad("Tokio", "Mesako Mimoko", "Febrero", 10000);
        Ciudad c5 = new Ciudad("Tokio", "Mesako Mimoko", "Marzo", 20000);
        Ciudad c6 = new Ciudad("Bogota", "Tumoto Tachida", "Enero", 500);
        Ciudad c7 = new Ciudad("Bogota", "Tumoto Tachida", "Febrero", 400);
        Ciudad c8 = new Ciudad("Bogota", "Mesako Mimoko", "Enero", 800);
        Ciudad c9 = new Ciudad("Bogota", "Mesako Mimoko", "Febrero", 700);
        Ciudad c10 = new Ciudad("Bogota", "Mesako Mimoko", "Marzo", 600);
        Ciudad c11 = new Ciudad("Denver", "Tumoto Tachida", "Enero", 10000);
        Ciudad c12 = new Ciudad("Denver", "Tumoto Tachida", "Febrero", 8000);
        Ciudad c13 = new Ciudad("Denver", "Mesako Mimoko", "Enero", 15000);
        Ciudad c14 = new Ciudad("Denver", "Mesako Mimoko", "Febrero", 30000);
        Ciudad c15 = new Ciudad("Denver", "Mesako Mimoko", "Marzo", 250000);
        Ciudad c16 = new Ciudad("Helsinki", "Tumoto Tachida", "Enero", 704500);
        Ciudad c17 = new Ciudad("Helsinki", "Tumoto Tachida", "Febrero", 434500);
        Ciudad c18 = new Ciudad("Helsinki", "Mesako Mimoko", "Enero", 8627900);
        Ciudad c19 = new Ciudad("Helsinki", "Mesako Mimoko", "Febrero", 53700);
        Ciudad c20 = new Ciudad("Helsinki", "Mesako Mimoko", "Marzo", 2200);

        //Se crea una lista
        List<Ciudad> ciudadList = new ArrayList<>();


        ciudadList.add(c1);
        ciudadList.add(c2);
        ciudadList.add(c3);
        ciudadList.add(c4);
        ciudadList.add(c5);
        ciudadList.add(c6);
        ciudadList.add(c7);
        ciudadList.add(c8);
        ciudadList.add(c9);
        ciudadList.add(c10);
        ciudadList.add(c11);
        ciudadList.add(c12);
        ciudadList.add(c13);
        ciudadList.add(c14);
        ciudadList.add(c15);
        ciudadList.add(c16);
        ciudadList.add(c17);
        ciudadList.add(c18);
        ciudadList.add(c19);
        ciudadList.add(c20);

        //Se filtra primero por la ciudad Strign luego por el almacen y final la venta
        Map<String, Map<String, Long>> map = ciudadList.stream().collect(
                Collectors.groupingBy(
                        Ciudad::getNombre, Collectors.groupingBy(
                                Ciudad::getMes, Collectors.summingLong(Ciudad::getVenta)
                        )
                )
        );

        System.out.println(map);
    }

}
