// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        @Test
        @DisplayName("Country that is feminine")
        void testFeminine() {
            assertEquals("la Mongolie", FrenchCountryNames.addFrenchArticleToCountry("Mongolie"));
        }

        @Test
        @DisplayName("Country that is plural")
        void testPlural() {
            assertEquals("les Etats-Unis", FrenchCountryNames.addFrenchArticleToCountry("Etats-Unis"));
        }

        @Test
        @DisplayName("Country that is masculine despite ending with 'e'")
        void test3() {
            assertEquals("le Mexique", FrenchCountryNames.addFrenchArticleToCountry("Mexique"));
        }

        @Test
        @DisplayName("Country that starts with a vowel")
        void test4() {
            assertEquals("l'Algerie", FrenchCountryNames.addFrenchArticleToCountry("Algerie"));
        }
    }
}