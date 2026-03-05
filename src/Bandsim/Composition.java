package Bandsim;

    public class Composition {
        /*
        1. Band has-a Song
            - Band har feltet: ArrayList<Song> songs
            - Et band ejer sine sange – uden bandet giver sangene ikke mening
            - Relationen: Band "has a" Song

        2. Band has-a Venue (i playGig)
            - I metoden playGig(Venue venue, ...) bruger Band et Venue objekt
            - Bandet bruger Venue til at hente getName(), getCapacity() og getPayoutAmount()
            - Relationen: Band "has a" Venue når det spiller en koncert

        3. Band has-a Event (i randomEvent)
            - I randomEvent() opretter Band et array af Event objekter
            - Bandet bruger Event til at hente getDescription() og getFanImpact()
            - Relationen: Band "has a" Event under en tilfældig begivenhed

        4. Band has-a Random
            - Band har feltet: private Random random
            - Bruges i randomEvent() til at vælge en tilfældig begivenhed
            - Relationen: Band "has a" Random
         */
    }
