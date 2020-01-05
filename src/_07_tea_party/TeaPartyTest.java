package _07_tea_party;

import static org.junit.Assert.assertEquals;
        import org.junit.Test;

        public class TeaPartyTest {
         /**
          * Jane Austen is a woman, so say “Hello Ms. Austen”. 
          * George Orwell is a man, so say “Hello Mr. Orwell”. 
          * Isaac Newton was knighted, so say "Hello Sir Isaac Newton".
          **/

         @Test
         public void test() {
             @SuppressWarnings("unused")
			String greeting = TeaPartyRunner.welcome(null, false, false);
              assertEquals("Hello Ms. Austen",TeaPartyRunner.welcome("Austen", true, false));
              assertEquals("Hello Mr. Orwell",TeaPartyRunner.welcome("Orwell", false, false));
              assertEquals("Hello Sir Isaac Newton", TeaPartyRunner.welcome("Isaac Newton", false, true));
         }
        }
            
       


