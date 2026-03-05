package Bandsim;

    public class Inheritance {
        /*
        Song, Venue og Event ligner hinanden meget:
            - De har alle private felter
            - De har alle en konstruktør der sætter felterne
            - De har alle getters der returnerer felterne
            - De har alle en String der beskriver dem (title / name / description)

        Man kunne lave en fælles superklasse fx kaldet "BandElement":

            - public abstract class BandElement {
                private String name;

            - public BandElement(String name) {
                this.name = name;
                }

            - public String getName() {
                 return name;
                }
           }

        Så ville relationerne være:
            - Song  is-a BandElement  (title er dens "name")
            - Venue is-a BandElement  (name er dens "name")
            - Event is-a BandElement  (description er dens "name")

        Det ville betyde at getName() kun skulle skrives ét sted
        i stedet for i hver klasse.







         */

    }
