package com.example.lugaresapp;

import java.util.ArrayList;
import java.util.List;

public class PlaceRepository {

    public List<Place> loadPlaces() {

        List<Place> list = new ArrayList<>();

        list.add(new Place(
                "Estadio Nacional",
                "El principal recinto deportivo de Chile, sede de partidos, conciertos y grandes eventos.",
                "Ñuñoa, Santiago",
                "https://images.pexels.com/photos/399187/pexels-photo-399187.jpeg",
                -33.4727, -70.6103
        ));

        list.add(new Place(
                "Cajón del Maipo",
                "Destino natural emblemático con montañas, ríos, termas y actividades de aventura.",
                "San José de Maipo",
                "https://images.pexels.com/photos/417074/pexels-photo-417074.jpeg",
                -33.65, -70.35
        ));

        list.add(new Place(
                "Plaza de Armas",
                "El corazón histórico de Santiago, rodeado de edificios coloniales y cultura urbana.",
                "Santiago Centro",
                "https://images.pexels.com/photos/460672/pexels-photo-460672.jpeg",
                -33.4372, -70.6506
        ));

        list.add(new Place(
                "Palacio de La Moneda",
                "El palacio presidencial de Chile, símbolo histórico y político del país.",
                "Santiago Centro",
                "https://images.pexels.com/photos/208636/pexels-photo-208636.jpeg",
                -33.4440, -70.6536
        ));

        list.add(new Place(
                "Parque Metropolitano",
                "Uno de los parques urbanos más grandes del mundo, ideal para deportes y paseos familiares.",
                "Recoleta, Santiago",
                "https://images.pexels.com/photos/325185/pexels-photo-325185.jpeg",
                -33.4167, -70.6333
        ));

        list.add(new Place(
                "Cerro San Cristóbal",
                "Famoso cerro con vista panorámica a Santiago, accesible a pie, bicicleta y funicular.",
                "Providencia",
                "https://images.pexels.com/photos/460672/pexels-photo-460672.jpeg",
                -33.4170, -70.6400
        ));

        list.add(new Place(
                "Museo de Bellas Artes",
                "Museo histórico que alberga obras de arte chilenas e internacionales.",
                "Parque Forestal",
                "https://images.pexels.com/photos/532271/pexels-photo-532271.jpeg",
                -33.4360, -70.6414
        ));

        list.add(new Place(
                "Costanera Center",
                "Rascacielos más alto de Latinoamérica con mirador 360° y gran centro comercial.",
                "Providencia",
                "https://images.pexels.com/photos/373912/pexels-photo-373912.jpeg",
                -33.4167, -70.6064
        ));

        list.add(new Place(
                "Mall Alto Las Condes",
                "Centro comercial moderno con tiendas premium, gastronomía y espacios familiares.",
                "Las Condes",
                "https://images.pexels.com/photos/3965542/pexels-photo-3965542.jpeg",
                -33.4058, -70.5429
        ));

        list.add(new Place(
                "Parque Bicentenario",
                "Hermoso parque con lagunas, esculturas y zonas verdes para descansar o hacer picnic.",
                "Vitacura",
                "https://images.pexels.com/photos/1431822/pexels-photo-1431822.jpeg",
                -33.4010, -70.6065
        ));

        list.add(new Place(
                "Isla Negra",
                "Casa museo de Pablo Neruda frente al océano, llena de historia y poesía.",
                "El Quisco",
                "https://images.pexels.com/photos/15830259/pexels-photo-15830259.jpeg",
                -33.4161, -71.6961
        ));

        list.add(new Place(
                "Valparaíso",
                "Ciudad patrimonial con cerros coloridos, murales artísticos y arquitectura histórica.",
                "Valparaíso",
                "https://images.pexels.com/photos/3035990/pexels-photo-3035990.jpeg",
                -33.0472, -71.6127
        ));

        list.add(new Place(
                "Viña del Mar",
                "La Ciudad Jardín, conocida por sus playas, castillos y ambiente turístico.",
                "Viña del Mar",
                "https://images.pexels.com/photos/460672/pexels-photo-460672.jpeg",
                -33.0153, -71.5500
        ));

        list.add(new Place(
                "Pucón",
                "Atractivo destino turístico con lago, bosques y el volcán Villarrica.",
                "Araucanía",
                "https://images.pexels.com/photos/414171/pexels-photo-414171.jpeg",
                -39.2825, -71.9530
        ));

        list.add(new Place(
                "Lago Villarrica",
                "Hermoso lago rodeado de naturaleza, perfecto para deportes acuáticos.",
                "Araucanía",
                "https://images.pexels.com/photos/191329/pexels-photo-191329.jpeg",
                -39.2650, -72.0220
        ));

        list.add(new Place(
                "Puerto Varas",
                "Ciudad sureña con encanto alemán y vistas impresionantes al volcán Osorno.",
                "Los Lagos",
                "https://images.pexels.com/photos/414227/pexels-photo-414227.jpeg",
                -41.3184, -72.9854
        ));

        list.add(new Place(
                "Torres del Paine",
                "Uno de los paisajes más imponentes del mundo, con montañas, glaciares y lagos.",
                "Patagonia",
                "https://images.pexels.com/photos/414171/pexels-photo-414171.jpeg",
                -51.2530, -72.3500
        ));

        list.add(new Place(
                "San Pedro de Atacama",
                "Destino único con desierto, salares, geisers y cielos perfectos para astronomía.",
                "Antofagasta",
                "https://images.pexels.com/photos/259698/pexels-photo-259698.jpeg",
                -22.9087, -68.1997
        ));

        list.add(new Place(
                "Valle de la Luna",
                "Paisaje desértico de apariencia lunar con formaciones rocosas únicas.",
                "San Pedro de Atacama",
                "https://images.pexels.com/photos/1644895/pexels-photo-1644895.jpeg",
                -22.9270, -68.2460
        ));

        list.add(new Place(
                "La Serena",
                "Ciudad costera con arquitectura colonial, playas extensas y clima ideal.",
                "Región de Coquimbo",
                "https://images.pexels.com/photos/3408744/pexels-photo-3408744.jpeg",
                -29.9045, -71.2489
        ));

        return list;
    }
}
