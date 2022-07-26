/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ANTHONY
 */
public class ConditionTest {
    
    Condition c = new Condition();
    
    public ConditionTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of Valider method, of class Condition.
     */
    @Test
    public void testValider() {
        System.out.println("Valider");
        int unNbDeJours = 28;
        boolean expResult = true;
        boolean result = c.Valider(unNbDeJours);
        assertEquals(expResult, result);
    }

    /**
     * Test of CalculerMontantMaxCategorie method, of class Condition.
     */
    @Test
    public void testCalculerMontantMaxCategorie() {
        System.out.println("CalculerMontantMaxCategorie");
        String uneCategorie = "Informatique";
        int expResult = 1000;
        int result = c.CalculerMontantMaxCategorie(uneCategorie);
        assertEquals(expResult, result);
    }

    /**
     * Test of CalculerReductionMembre method, of class Condition.
     */
    @Test
    public void testCalculerReductionMembre() {
        System.out.println("CalculerReductionMembre");
        boolean estMembre = true;
        double expResult = 0.0;
        double result = c.CalculerReductionMembre(estMembre);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of CalculerReductionEtat method, of class Condition.
     */
    @Test
    public void testCalculerReductionEtat() {
        System.out.println("CalculerReductionEtat");
        String unEtat = "Abimé";
        double expResult = 0.3;
        double result = c.CalculerReductionEtat(unEtat);
        assertEquals(expResult, result, 0.0);    
    }

    /**
     * Test of CalculerMontantRembourse method, of class Condition.
     */
    @Test
    public void testCalculerMontantRembourse() {
        System.out.println("CalculerMontantRembourse");
        int unNbDeJours = 15;
        String uneCategorie = "Jouets";
        boolean estMembre = true;
        String unEtat = "Trés abimé";
        int unPrix = 50;
        double expResult = 35.0;
        double result = c.CalculerMontantRembourse(unNbDeJours, uneCategorie, estMembre, unEtat, unPrix);
        assertEquals(expResult, result, 0.0);
    }
    
}
