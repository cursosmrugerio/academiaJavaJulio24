package optional;

import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.Test;

public class TestOptional {

	@Test
	public void whenCreatesEmptyOptional_thenCorrect() {
	    Optional<String> empty = Optional.empty();
	    //System.out.println(empty.isPresent());
	    assertFalse(empty.isPresent());
	}
	
	@Test
	public void givenNonNull_whenCreatesNonNullable_thenCorrect() {
	    String name = "baeldung";
	    Optional<String> opt = Optional.of(name);
	    assertTrue(opt.isPresent());
	}
	
	@Test(expected = NullPointerException.class)
	public void givenNull_whenThrowsErrorOnCreate_thenCorrect() {
	    String name = null;
	    Optional.of(name);
	}
	
	@Test
	public void givenNonNull_whenCreatesNullable_thenCorrect() {
	    String name = "baeldung";
	    Optional<String> opt = Optional.ofNullable(name);
	    assertTrue(opt.isPresent());
	}

	@Test
	public void givenNull_whenCreatesNullable_thenCorrect() {
	    String name = null;
	    Optional<String> opt = Optional.ofNullable(name);
	    assertFalse(opt.isPresent());
	}
	
	@Test
	public void givenOptional_whenIsPresentWorks_thenCorrect() {
	    Optional<String> opt = Optional.of("Baeldung");
	    assertTrue(opt.isPresent());

	    opt = Optional.ofNullable(null);
	    assertFalse(opt.isPresent());
	}
	
	@Test
	public void givenAnEmptyOptional_thenIsEmptyBehavesAsExpected() {
	    Optional<String> opt = Optional.of("Baeldung");
	    assertFalse(opt.isEmpty());

	    opt = Optional.ofNullable(null);
	    assertTrue(opt.isEmpty());
	}
	
	@Test
	public void givenOptional_whenIfPresentWorks_thenCorrect() {
	    Optional<String> opt = Optional.of("baeldung");
	    opt.ifPresent(x -> System.out.println(x.length()));
	}
	
	@Test
	public void whenOrElseWorks_thenCorrect() {
	    String nullName = null;
	    String name = Optional
	    		.ofNullable(nullName)
	    		.orElse("john");
	    
	    assertEquals("john", name);
	}
	
	@Test
	public void whenOrElseGetWorks_thenCorrect() {
	    String nullName = null;
	    String name = Optional.ofNullable(nullName)
	    		.orElseGet(() -> "john");
	    assertEquals("john", name);
	}
	
	public String getMyDefault() {
	    System.out.println("Getting Default Value $$$");
	    return "Default Value$$$$";
	}
	
	@Test
	public void whenOrElseGetAndOrElseOverlap_thenCorrect() {
	    String text = null;

	    String defaultText = Optional.ofNullable(text)
	    		.orElseGet(this::getMyDefault);
	    assertEquals("Default Value", defaultText);

	    defaultText = Optional.ofNullable(text)
	    		.orElse(getMyDefault());
	    assertEquals("Default Value", defaultText);
	}
	
	@Test
	public void whenOrElseGetAndOrElseDiffer_thenCorrect() {
	    String text = "Text present";

	    System.out.println("Using orElseGet:");
	    String defaultText 
	      = Optional.ofNullable(text)
	      				.orElseGet(() -> this.getMyDefault()); //YA NO SE INVOCA
	    assertEquals("Text present", defaultText);

	    System.out.println("Using orElse:");
	    defaultText = Optional.ofNullable(text)
	    				.orElse(getMyDefault());
	    assertEquals("Text present", defaultText);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void whenOrElseThrowWorks_thenCorrect() {
	    String nullName = null;
	    String name = Optional.ofNullable(nullName)
	    	.orElseThrow(() ->new IllegalArgumentException());
	}
	
}
