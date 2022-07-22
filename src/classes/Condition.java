/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author ANTHONY
 */
public class Condition 
{
    static final int nbJours = 30;
    
    public static  boolean Valider(int unNbDeJours)
    {       
       boolean valide = true;
        if(nbJours < unNbDeJours)
        {
            valide = false;
        }
        return valide;
      
    }
    
    public static int CalculerMontantMaxCategorie(String uneCategorie)
    {
        int maxMontant = 0;
        if(uneCategorie == "Livres")
        {
            maxMontant = 30;
        }
        
        if(uneCategorie == "Jouets")
        {
            maxMontant = 50;
        }
        
        if(uneCategorie == "Informatique")
        {
            maxMontant = 1000;
        }
        return maxMontant;
    }
    
    public static double CalculerReductionMembre(boolean estMembre)
    {
        boolean membre = estMembre;
        double reductionMembre = 0;
        
        if(membre == false)
        {
            reductionMembre = 0.2;
        }
        return reductionMembre;
    }
    
    public static double CalculerReductionEtat(String unEtat)
    {
        double reductionEtat = 0.1;
        if(unEtat == "Abimé" || unEtat == "Trés abimé")
        {
          reductionEtat = 0.3;
        }
        return reductionEtat;
    }
    
    
    public static double CalculerMontantRembourse(int unNbDeJours, String uneCategorie, boolean estMembre,String unEtat, int unPrix)
    {
        double MontantRembourse = 0;
        if(Valider(unNbDeJours))
        {
            MontantRembourse = unPrix *(1-CalculerReductionMembre(estMembre)-CalculerReductionEtat(unEtat));
            if(MontantRembourse > CalculerMontantMaxCategorie(uneCategorie))
            {
                MontantRembourse = CalculerMontantMaxCategorie(uneCategorie);
            }
        }
        return MontantRembourse;
    }
}
