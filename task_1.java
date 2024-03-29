@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    
   
	assertEquals("кажется что 19 больше 18",true, isAdult); // Напиши код здесь
}
