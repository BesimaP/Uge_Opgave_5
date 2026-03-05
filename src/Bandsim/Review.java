package Bandsim;

    public class Review {
        /*
        1. Hvad er fordelen ved Building.getTotalLampCount() frem for at tælle i main?
            Men rooms og lamps er private — main kan slet ikke se dem!
            Ved at lægge logikken i Building holder du data og adfærd samlet ét sted.
            Det hedder encapsulation.
            main behøver bare kalde getTotalLampCount() uden at vide hvordan det beregnes.

         2. Hvornår ville det give mening at gøre Animal abstrakt?
            abstract bruges når superklassen er for generel til at eksistere alene.
            Man undgår fejl — ingen kan oprette et dyr der ikke kan angribe
            Man tvinger alle subklasser til at implementere attack() — ellers kompilerer koden ikke
         */
    }
