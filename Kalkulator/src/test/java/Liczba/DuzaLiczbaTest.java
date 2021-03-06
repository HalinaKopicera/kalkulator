package Liczba;

import static org.junit.Assert.*;

import org.junit.Test;

import Kalkulator.BlednaLiczbaException;

/**
 * Testy jednostkowe klasy <code>DuzaLiczba</code>
 *
 */
public class DuzaLiczbaTest {

	private static final int[] LICZBA_TESTOWA = new int[] {9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1,9,8,7,6,5,4,3,2,1};

	/**
	 * Sprawdzenie czy liczba podana w postaci stringa dobrze zamienia się na tablicę
	 * @throws BlednaLiczbaException 
	 */
	@Test
	public void testKonstruktorString() throws BlednaLiczbaException {
		DuzaLiczba liczba = new DuzaLiczba("123456789123456789123456789");
		assertArrayEquals(LICZBA_TESTOWA, liczba.getLiczbaInt());
	}



	/**
	 * Sprawdzenie czy niepoprawna liczba zglasza wyjatek
	 * @throws BlednaLiczbaException 
	 */
	@Test(expected = BlednaLiczbaException.class)
	public void testNowyBledny() throws BlednaLiczbaException {
		new DuzaLiczba("liczba");
	}
	
	/**
	 * Sprawdzenie długości liczby
	 * @throws BlednaLiczbaException
	 */
	@Test
	public void testDlugosc() throws BlednaLiczbaException {
		DuzaLiczba liczba = new DuzaLiczba("123456789123456789123456789");
		assertEquals(27, liczba.getDlugosc());
	}
	
	/**
	 * Sprawdzenie czy ustawiona tablica jest tym samym obiektem
	 * @throws BlednaLiczbaException 
	 */
	@Test
	public void testTablica() throws BlednaLiczbaException {
		DuzaLiczba liczba = new DuzaLiczba();
		liczba.setLiczbaInt(LICZBA_TESTOWA);
		assertSame(LICZBA_TESTOWA, liczba.getLiczbaInt());		
	}
	

	/**
	 * Sprawdzenie długości liczby dla pustego obiektu - nie może być nullem
	 * @throws BlednaLiczbaException
	 */
	@Test
	public void testDlugoscPusty() throws BlednaLiczbaException {
		DuzaLiczba liczba = new DuzaLiczba();
		assertNotNull (liczba.getDlugosc());
	}
	/**
	 * Sprawdzenie długości liczby dla pustego obiektu -czy równa 0
	 * @throws BlednaLiczbaException
	 */
	@Test
	public void testDlugoscPusty0() throws BlednaLiczbaException {
		DuzaLiczba liczba = new DuzaLiczba();
		assertEquals(0, liczba.getDlugosc());
	}
	/**
	 * Sprawdzenie zawartości liczby przechowywanej w String dla pustego obiektu 
	 * @throws BlednaLiczbaException
	 */
	@Test
	public void testStringPusty() throws BlednaLiczbaException {
		DuzaLiczba liczba = new DuzaLiczba();
		assertNull(liczba.getLiczbaInt());
	}
	/**
	 * Sprawdzenie zawartości liczby przechowywanej w tablicy dla pustego obiektu 
	 * @throws BlednaLiczbaException
	 */
	@Test
	public void testTabPusty() throws BlednaLiczbaException {
		DuzaLiczba liczba = new DuzaLiczba();
		assertNull(liczba.getLiczbaInt());
	}
}
