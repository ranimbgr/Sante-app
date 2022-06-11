/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_patient_param
 * Date : 05/06/2022 23:17:07
 * Version de wdjava.dll  : 25.0.221.6
 */


package com.masociete.sante.wdgen;


import com.masociete.sante.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.ui.champs.saisie.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_patient_param extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_patient_param
////////////////////////////////////////////////////////////////////////////

/**
 * LIB_Pseudo
 */
class GWDLIB_Pseudo extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_patient_param.LIB_Pseudo
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2486288359295322318l);

super.setChecksum("595435581");

super.setNom("LIB_Pseudo");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Pseudo");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(8, 0);

super.setTailleInitiale(304, 19);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(1);

super.setLiaisonFichier("traitement", "login_pt");

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x848282, 0xFFFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 3, 0, 0x848282);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xBAA532, 0x3A2500, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_Pseudo mWD_LIB_Pseudo;

/**
 * SAI_Login_Pseudo
 */
class GWDSAI_Login_Pseudo extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_patient_param.SAI_Login_Pseudo
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,316,21);
super.setRectCompPrincipal(0,21,316,40);
super.setQuid(2486290171819587089l);

super.setChecksum("643501406");

super.setNom("SAI_Login_Pseudo");

super.setType(20001);

super.setBulle("");

super.setLibelle("Pseudo (Login)");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(2, 48);

super.setTailleInitiale(316, 63);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(1);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(2);

super.setMiseABlancSiZero(true);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x848282, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 3, 0, 0x848282);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xBAA532, 0x3A2500, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Users\\Ranim\\Desktop\\Santé - CS\\Gabarits\\WM\\180 Poulco\\Poulco_Edt.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFF, 1, 5));

super.setStyleSaisie(0x848282, creerPolice_GEN("Trebuchet MS", -8.000000, 0));

super.setStyleTexteIndication(0xB3B3B3, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0x7544182A, 0x40000, 0xFFFFFF, 4.000000, 4.000000, 1, 1), 0xFFFFFF, "", 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_Login_Pseudo mWD_SAI_Login_Pseudo;

/**
 * SAI_Mot_de_passe
 */
class GWDSAI_Mot_de_passe extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_patient_param.SAI_Mot_de_passe
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,316,21);
super.setRectCompPrincipal(0,21,316,40);
super.setQuid(2486290171819718177l);

super.setChecksum("643632581");

super.setNom("SAI_Mot_de_passe");

super.setType(20001);

super.setBulle("");

super.setLibelle("Mot de passe");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(2, 115);

super.setTailleInitiale(316, 63);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(true);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(2);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(2);

super.setMiseABlancSiZero(true);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x848282, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 3, 0, 0x848282);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xBAA532, 0x3A2500, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Users\\Ranim\\Desktop\\Santé - CS\\Gabarits\\WM\\180 Poulco\\Poulco_Edt.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFF, 1, 5));

super.setStyleSaisie(0x848282, creerPolice_GEN("Trebuchet MS", -8.000000, 0));

super.setStyleTexteIndication(0xB3B3B3, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0x7544182A, 0x40000, 0xFFFFFF, 4.000000, 4.000000, 1, 1), 0xFFFFFF, "", 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_Mot_de_passe mWD_SAI_Mot_de_passe;

/**
 * SAI_Nom
 */
class GWDSAI_Nom extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_patient_param.SAI_Nom
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,316,21);
super.setRectCompPrincipal(0,21,316,40);
super.setQuid(2486290171819849249l);

super.setChecksum("643763566");

super.setNom("SAI_Nom");

super.setType(20001);

super.setBulle("");

super.setLibelle("Nom");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(2, 179);

super.setTailleInitiale(316, 63);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(3);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(2);

super.setMiseABlancSiZero(true);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x848282, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 3, 0, 0x848282);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xBAA532, 0x3A2500, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Users\\Ranim\\Desktop\\Santé - CS\\Gabarits\\WM\\180 Poulco\\Poulco_Edt.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFF, 1, 5));

super.setStyleSaisie(0x848282, creerPolice_GEN("Trebuchet MS", -8.000000, 0));

super.setStyleTexteIndication(0xB3B3B3, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0x7544182A, 0x40000, 0xFFFFFF, 4.000000, 4.000000, 1, 1), 0xFFFFFF, "", 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_Nom mWD_SAI_Nom;

/**
 * SAI_Prénom
 */
class GWDSAI_Prenom extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FEN_patient_param.SAI_Prénom
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,316,21);
super.setRectCompPrincipal(0,21,316,40);
super.setQuid(2486290171819980321l);

super.setChecksum("643894638");

super.setNom("SAI_Prénom");

super.setType(20001);

super.setBulle("");

super.setLibelle("Prénom");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(2, 249);

super.setTailleInitiale(316, 63);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(4);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(2);

super.setMiseABlancSiZero(true);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x848282, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 3, 0, 0x848282);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xBAA532, 0x3A2500, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Users\\Ranim\\Desktop\\Santé - CS\\Gabarits\\WM\\180 Poulco\\Poulco_Edt.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFF, 1, 5));

super.setStyleSaisie(0x848282, creerPolice_GEN("Trebuchet MS", -8.000000, 0));

super.setStyleTexteIndication(0xB3B3B3, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0x7544182A, 0x40000, 0xFFFFFF, 4.000000, 4.000000, 1, 1), 0xFFFFFF, "", 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_Prenom mWD_SAI_Prenom;

/**
 * SAI_Année_Naissance
 */
class GWDSAI_Annee_Naissance extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de FEN_patient_param.SAI_Année_Naissance
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,147,40);
super.setRectCompPrincipal(147,2,90,40);
super.setQuid(2486290171820111408l);

super.setChecksum("644072186");

super.setNom("SAI_Année_Naissance");

super.setType(20004);

super.setBulle("");

super.setLibelle("Année Naissance");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(2, 317);

super.setTailleInitiale(237, 44);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(2);

super.setMotDePasse(false);

super.setTypeSaisie(1);

super.setMasqueSaisie(new WDChaineU("9999"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(6);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(5);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x848282, creerPolice_GEN("Trebuchet MS", -8.000000, 0), -2, 0, 0x848282);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xBAA532, 0x3A2500, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Users\\Ranim\\Desktop\\Santé - CS\\Gabarits\\WM\\180 Poulco\\Poulco_Edt.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFF, 1, 5));

super.setStyleSaisie(0x848282, creerPolice_GEN("Trebuchet MS", -8.000000, 0));

super.setStyleTexteIndication(0xB3B3B3, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0x7544182A, 0x40000, 0xFFFFFF, 4.000000, 4.000000, 1, 1), 0xFFFFFF, "", 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_Annee_Naissance mWD_SAI_Annee_Naissance;

/**
 * BTN_Valider
 */
class GWDBTN_Valider extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de FEN_patient_param.BTN_Valider
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2486290171820242480l);

super.setChecksum("644157709");

super.setNom("BTN_Valider");

super.setType(4);

super.setBulle("");

super.setLibelle("Valider");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(109, 413);

super.setTailleInitiale(102, 36);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(7);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setNumTab(6);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(true);

super.setImage("", 0, 2, 1, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0, 0x848282);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0, 0x848282);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0, 0x848282);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(2, 0x7544182A, 0x40000, 0xFFFFFF, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(2, 0x7544182A, 0x40000, 0xFFFFFF, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(2, 0x7544182A, 0x40000, 0xFFFFFF, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 8, 8);

super.setImageFond("C:\\Users\\Ranim\\Desktop\\Santé - CS\\Gabarits\\WM\\180 Poulco\\Poulco_Btn_Std.png?E5_A1A6A1A6A1_3NP_8_8_10_10", 1, 0, 1, 6);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_Valider
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// si SAI_Login_Pseudo = "" ou SAI_Mot_de_passe = "" ou SAI_Nom = "" ou SAI_Prénom = "" ou SAI_Année_Naissance = 0 ALORS
// si SAI_Login_Pseudo = "" ou SAI_Mot_de_passe = "" ou SAI_Nom = "" ou SAI_Prénom = "" ou SAI_Année_Naissance = 0 ALORS
if(((((mWD_SAI_Login_Pseudo.opEgal("") | mWD_SAI_Mot_de_passe.opEgal("")) | mWD_SAI_Nom.opEgal("")) | mWD_SAI_Prenom.opEgal("")) | mWD_SAI_Annee_Naissance.opEgal(0)))
{
// 	info("Veuillez remplir tous les champs")
WDAPIDialogue.info("Veuillez remplir tous les champs");

}
else
{
// 	SI SAI_Année_Naissance > AnnéeEnCours() ALORS
if(mWD_SAI_Annee_Naissance.opSup(WDAPIDate.anneeEnCours()))
{
// 		Info("Année erronée")
WDAPIDialogue.info("Année erronée");

}
else
{
// 			HLitRecherche(patient,login_pt,LIB_Pseudo,hIdentique)	 
WDAPIHF.hLitRecherche(WDAPIHF.getFichierSansCasseNiAccent("patient"),WDAPIHF.getRubriqueSansCasseNiAccent("login_pt"),mWD_LIB_Pseudo,(long)524288);

// 			HSupprime(patient)
WDAPIHF.hSupprime(WDAPIHF.getFichierSansCasseNiAccent("patient"));

// 			si HLitRecherche(patient,login_pt,SAI_Login_Pseudo,hIdentique)	 ALORS
if(WDAPIHF.hLitRecherche(WDAPIHF.getFichierSansCasseNiAccent("patient"),WDAPIHF.getRubriqueSansCasseNiAccent("login_pt"),mWD_SAI_Login_Pseudo,(long)524288).getBoolean())
{
// 				info("Le Login existe déjà")
WDAPIDialogue.info("Le Login existe déjà");

}
else
{
// 					patient.login_pt = SAI_Login_Pseudo
WDAPIHF.getFichierSansCasseNiAccent("patient").getRubriqueSansCasseNiAccent("login_pt").setValeur(mWD_SAI_Login_Pseudo);

// 					patient.passe_pt = SAI_Mot_de_passe
WDAPIHF.getFichierSansCasseNiAccent("patient").getRubriqueSansCasseNiAccent("passe_pt").setValeur(mWD_SAI_Mot_de_passe);

// 					patient.nom_pt = SAI_Nom
WDAPIHF.getFichierSansCasseNiAccent("patient").getRubriqueSansCasseNiAccent("nom_pt").setValeur(mWD_SAI_Nom);

// 					patient.prenom_pt = SAI_Prénom
WDAPIHF.getFichierSansCasseNiAccent("patient").getRubriqueSansCasseNiAccent("prenom_pt").setValeur(mWD_SAI_Prenom);

// 					patient.annee_naissance_pt = SAI_Année_Naissance
WDAPIHF.getFichierSansCasseNiAccent("patient").getRubriqueSansCasseNiAccent("annee_naissance_pt").setValeur(mWD_SAI_Annee_Naissance);

// 					HAjoute(patient)
WDAPIHF.hAjoute(WDAPIHF.getFichierSansCasseNiAccent("patient"));

// 				si SAI_Login_Pseudo <> LIB_Pseudo ALORS
if(mWD_SAI_Login_Pseudo.opDiff(mWD_LIB_Pseudo))
{
// 					REQ_traitement_update_loginpatient.Paramcondition		= LIB_Pseudo
WDAPIHF.getFichierSansCasseNiAccent("req_traitement_update_loginpatient").getRubriqueSansCasseNiAccent("paramcondition").setValeur(mWD_LIB_Pseudo);

// 					REQ_traitement_update_loginpatient.Paramaffectation	= SAI_Login_Pseudo
WDAPIHF.getFichierSansCasseNiAccent("req_traitement_update_loginpatient").getRubriqueSansCasseNiAccent("paramaffectation").setValeur(mWD_SAI_Login_Pseudo);

// 					HExécuteRequête(REQ_traitement_update_loginpatient)
WDAPIHF.hExecuteRequete(WDAPIHF.getRequeteSansCasseNiAccent("req_traitement_update_loginpatient"));

// 					REQ_prise_update_loginpatient.Paramcondition		= LIB_Pseudo
WDAPIHF.getFichierSansCasseNiAccent("req_prise_update_loginpatient").getRubriqueSansCasseNiAccent("paramcondition").setValeur(mWD_LIB_Pseudo);

// 					REQ_prise_update_loginpatient.Paramaffectation		= SAI_Login_Pseudo
WDAPIHF.getFichierSansCasseNiAccent("req_prise_update_loginpatient").getRubriqueSansCasseNiAccent("paramaffectation").setValeur(mWD_SAI_Login_Pseudo);

// 					HExécuteRequête(REQ_prise_update_loginpatient)
WDAPIHF.hExecuteRequete(WDAPIHF.getRequeteSansCasseNiAccent("req_prise_update_loginpatient"));

// 					REQ_patient_parrain_update_loginpatient.Paramcondition		= LIB_Pseudo
WDAPIHF.getFichierSansCasseNiAccent("req_patient_parrain_update_loginpatient").getRubriqueSansCasseNiAccent("paramcondition").setValeur(mWD_LIB_Pseudo);

// 					REQ_patient_parrain_update_loginpatient.Paramaffectation		= SAI_Login_Pseudo
WDAPIHF.getFichierSansCasseNiAccent("req_patient_parrain_update_loginpatient").getRubriqueSansCasseNiAccent("paramaffectation").setValeur(mWD_SAI_Login_Pseudo);

// 					HExécuteRequête(REQ_traitement_update_loginpatient)
WDAPIHF.hExecuteRequete(WDAPIHF.getRequeteSansCasseNiAccent("req_traitement_update_loginpatient"));

}

// 					LIB_Pseudo = SAI_Login_Pseudo
mWD_LIB_Pseudo.setValeur(mWD_SAI_Login_Pseudo);

// 					Info("Modifié avec succès ... vous allez être déconnecter")	
WDAPIDialogue.info("Modifié avec succès ... vous allez être déconnecter");

// 					OuvreFenêtreMobile(FEN_Connexion)
WDAPIFenetre.ouvreFille(GWDPSante.getInstance().mWD_FEN_Connexion);

}

}

}

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_Valider mWD_BTN_Valider;

/**
 * ACTB_ActionBar
 */
class GWDACTB_ActionBar extends WDActionBar
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_patient_param.ACTB_ActionBar
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setNom("ACTB_ActionBar");

super.setNote("", "");

super.setParamBoutonGauche(true, 1, "", "");

super.setParamBoutonDroit(false, 0, "", "");

super.setStyleActionBar(0xFFFFFF, 0xBAA532, false);

super.setImageFond("");

super.setStyleBarreNavigation(0xFF000001, 0x808080);

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDACTB_ActionBar mWD_ACTB_ActionBar;

/**
 * Traitement: Déclarations globales de FEN_patient_param
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCEDURE MaFenêtre(gsPseudo est une chaîne)
super.declarerGlobale(WD_tabParam, 1, 1);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;

// Traitement du paramètre n°0
if(0<WD_ntabParamLen) 
{
vWD_gsPseudo = WD_tabParam[0];
}
else { vWD_gsPseudo = null; }
super.ajouterVariableGlobale("gsPseudo",vWD_gsPseudo);


vWD_gsPseudo = WDParametre.traiterParametre(vWD_gsPseudo, 1, false, 16);


}




/**
 * Traitement: Prise de focus de FEN_patient_param
 */
public void priseDeFocus()
{
super.priseDeFocus();

// 
// LIB_Pseudo = gsPseudo
mWD_LIB_Pseudo.setValeur(vWD_gsPseudo);

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurFocus();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
 public WDObjet vWD_gsPseudo = WDVarNonAllouee.ref;
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre FEN_patient_param
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_LIB_Pseudo = new GWDLIB_Pseudo();
mWD_SAI_Login_Pseudo = new GWDSAI_Login_Pseudo();
mWD_SAI_Mot_de_passe = new GWDSAI_Mot_de_passe();
mWD_SAI_Nom = new GWDSAI_Nom();
mWD_SAI_Prenom = new GWDSAI_Prenom();
mWD_SAI_Annee_Naissance = new GWDSAI_Annee_Naissance();
mWD_BTN_Valider = new GWDBTN_Valider();
mWD_ACTB_ActionBar = new GWDACTB_ActionBar();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_patient_param
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2486288359295256782l);

super.setChecksum("600638686");

super.setNom("FEN_patient_param");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 495);

super.setTitre("Paramètres ");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPositionFenetre(1);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("", 1, 0, 1);

super.setCouleurTexteAutomatique(0x68635F);

super.setCouleurBarreSysteme(0xFF000001);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_patient_param
////////////////////////////////////////////////////////////////////////////
mWD_LIB_Pseudo.initialiserObjet();
super.ajouter("LIB_Pseudo", mWD_LIB_Pseudo);
mWD_SAI_Login_Pseudo.initialiserObjet();
super.ajouter("SAI_Login_Pseudo", mWD_SAI_Login_Pseudo);
mWD_SAI_Mot_de_passe.initialiserObjet();
super.ajouter("SAI_Mot_de_passe", mWD_SAI_Mot_de_passe);
mWD_SAI_Nom.initialiserObjet();
super.ajouter("SAI_Nom", mWD_SAI_Nom);
mWD_SAI_Prenom.initialiserObjet();
super.ajouter("SAI_Prénom", mWD_SAI_Prenom);
mWD_SAI_Annee_Naissance.initialiserObjet();
super.ajouter("SAI_Année_Naissance", mWD_SAI_Annee_Naissance);
mWD_BTN_Valider.initialiserObjet();
super.ajouter("BTN_Valider", mWD_BTN_Valider);
mWD_ACTB_ActionBar.initialiserObjet();
super.ajouterActionBar(mWD_ACTB_ActionBar);

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
public boolean isUniteAffichageLogique()
{
return false;
}

public WDProjet getProjet()
{
return GWDPSante.getInstance();
}

public IWDEnsembleElement getEnsemble()
{
return GWDPSante.getInstance();
}
public int getModeContexteHF()
{
return 1;
}
/**
* Retourne le mode d'affichage de l'ActionBar de la fenêtre.
*/
public int getModeActionBar()
{
return 1;
}
/**
* Retourne vrai si la fenêtre est maximisée, faux sinon.
*/
public boolean isMaximisee()
{
return true;
}
/**
* Retourne vrai si la fenêtre a une barre de titre, faux sinon.
*/
public boolean isAvecBarreDeTitre()
{
return true;
}
/**
* Retourne le mode d'affichage de la barre système de la fenêtre.
*/
public int getModeBarreSysteme()
{
return 1;
}
/**
* Retourne vrai si la fenêtre est munie d'ascenseurs automatique, faux sinon.
*/
public boolean isAvecAscenseurAuto()
{
return false;
}
/**
* Retourne Vrai si on doit appliquer un theme "dark" (sombre) ou Faux si on doit appliquer "light" (clair) à la fenêtre.
* Ce choix se base sur la couleur du libellé par défaut dans le gabarit de la fenêtre.
*/
public boolean isThemeDark()
{
return true;
}
/**
* Retourne vrai si l'option de masquage automatique de l'ActionBar lorsqu'on scrolle dans un champ de la fenêtre a été activée.
*/
public boolean isMasquageAutomatiqueActionBar()
{
return false;
}
public static class WDActiviteFenetre extends WDActivite
{
protected WDFenetre getFenetre()
{
return GWDPSante.getInstance().mWD_FEN_patient_param;
}
}
/**
* Retourne le nom du gabarit associée à la fenêtre.
*/
public String getNomGabarit()
{
return "180 POULCO#WM";
}
}
