/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_Inscription_Adhérant
 * Date : 30/05/2022 10:25:11
 * Version de wdjava.dll  : 25.0.221.6
 */


package com.masociete.sante.wdgen;


import com.masociete.sante.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.saisie.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.champs.combo.*;
import fr.pcsoft.wdjava.ui.champs.groupeoptions.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_Inscription_Adherant extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_Inscription_Adhérant
////////////////////////////////////////////////////////////////////////////

/**
 * SAI_Nom
 */
class GWDSAI_Nom extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Inscription_Adhérant.SAI_Nom
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,316,21);
super.setRectCompPrincipal(0,21,316,40);
super.setQuid(2469193659848098336l);

super.setChecksum("1126751293");

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

super.setPositionInitiale(8, 192);

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

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

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

super.setStyleLibelle(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0DCDA, 0x605C5A, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("F:\\Santé\\Phoenix_Edt@dpi1x.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFF, 1, 5));

super.setStyleSaisie(0x0, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStyleTexteIndication(0x8B8680, creerPolice_GEN("Roboto", -8.000000, 0), 0);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0xF48542, 0x740500, 0xFFFFFFFF, 4.000000, 4.000000, 1, 1), 0x68635F, "", 1);

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
// Déclaration des champs du fils n°2 de FEN_Inscription_Adhérant.SAI_Prénom
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,316,21);
super.setRectCompPrincipal(0,21,316,40);
super.setQuid(2469193659848229423l);

super.setChecksum("1126882380");

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

super.setPositionInitiale(8, 262);

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

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

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

super.setMiseABlancSiZero(true);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0DCDA, 0x605C5A, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("F:\\Santé\\Phoenix_Edt@dpi1x.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFF, 1, 5));

super.setStyleSaisie(0x0, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStyleTexteIndication(0x8B8680, creerPolice_GEN("Roboto", -8.000000, 0), 0);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0xF48542, 0x740500, 0xFFFFFFFF, 4.000000, 4.000000, 1, 1), 0x68635F, "", 1);

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
// Déclaration des champs du fils n°3 de FEN_Inscription_Adhérant.SAI_Année_Naissance
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,147,40);
super.setRectCompPrincipal(147,2,90,40);
super.setQuid(2469193659848360511l);

super.setChecksum("1127059929");

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

super.setPositionInitiale(8, 330);

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

super.setAltitude(3);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(6);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(6);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x262626, creerPolice_GEN("Roboto", -8.000000, 0), -2, 0, 0x808080);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("F:\\Santé\\Phoenix_Edt@dpi1x.png?E5_3NP_8_8_8_8", new int[] {1,2,1,2,2,2,1,2,1}, new int[] {8, 8, 8, 8}, 0xFFFFFFFF, 1, 5));

super.setStyleSaisie(0x262626, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStyleTexteIndication(0x717171, creerPolice_GEN("Roboto", -8.000000, 0), 0);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(27, 0xF3F3F3, 0x737373, 0xFFFFFF, 16.000000, 16.000000, 1, 1), 0x0, "", 1);

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
// Déclaration des champs du fils n°4 de FEN_Inscription_Adhérant.BTN_Valider
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2469193659848491583l);

super.setChecksum("1127145452");

super.setNom("BTN_Valider");

super.setType(4);

super.setBulle("");

super.setLibelle("Valider");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(112, 441);

super.setTailleInitiale(102, 36);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(8);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(true);

super.setImage("", 0, 2, 1, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0xFFFFFF);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0xFFFFFF);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0xFFFFFF);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1));

super.setImageFond9Images(new int[] {1,2,1,2,2,2,1,2,1}, 10, 10, 10, 10);

super.setImageFond("F:\\Santé\\Phoenix_Btn_Menu@dpi1_5x.png?E5_3NP_10_10_10_10", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_Valider
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// SI COMBO_Type..ValeurAffichée = "" OU SAI_Login_Pseudo = "" OU SAI_Mot_de_passe = "" OU SAI_Nom = "" OU SAI_Prénom = "" OU SAI_Année_Naissance = 0 ALORS
//MAP:2244568d20ea823f:00000012:1:FEN_Inscription_Adhérant.BTN_Valider:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant$GWDBTN_Valider:Clic sur BTN_Valider
// SI COMBO_Type..ValeurAffichée = "" OU SAI_Login_Pseudo = "" OU SAI_Mot_de_passe = "" OU SAI_Nom = "" OU SAI_Prénom = "" OU SAI_Année_Naissance = 0 ALORS
//MAP:2244568d20ea823f:00000012:1:FEN_Inscription_Adhérant.BTN_Valider:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant$GWDBTN_Valider:Clic sur BTN_Valider
if((((((mWD_COMBO_Type.getProp(EWDPropriete.PROP_VALEURAFFICHEE).opEgal("") | mWD_SAI_Login_Pseudo.opEgal("")) | mWD_SAI_Mot_de_passe.opEgal("")) | mWD_SAI_Nom.opEgal("")) | mWD_SAI_Prenom.opEgal("")) | mWD_SAI_Annee_Naissance.opEgal(0)))
{
// 	Info("Veuillez remplir tous les champs")
//MAP:2244568d20ea823f:00000012:4:FEN_Inscription_Adhérant.BTN_Valider:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant$GWDBTN_Valider:Clic sur BTN_Valider
WDAPIDialogue.info("Veuillez remplir tous les champs");

}
else
{
//  SI    SAI_Année_Naissance > AnnéeEnCours() ALORS
//MAP:2244568d20ea823f:00000012:8:FEN_Inscription_Adhérant.BTN_Valider:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant$GWDBTN_Valider:Clic sur BTN_Valider
if(mWD_SAI_Annee_Naissance.opSup(WDAPIDate.anneeEnCours()))
{
//    	    Info("Année erronée")
//MAP:2244568d20ea823f:00000012:a:FEN_Inscription_Adhérant.BTN_Valider:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant$GWDBTN_Valider:Clic sur BTN_Valider
WDAPIDialogue.info("Année erronée");

}
else
{
//    	     		SELON COMBO_Type..ValeurAffichée
//MAP:2244568d20ea823f:00000012:10:FEN_Inscription_Adhérant.BTN_Valider:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant$GWDBTN_Valider:Clic sur BTN_Valider
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
//    	     		SELON COMBO_Type..ValeurAffichée
//MAP:2244568d20ea823f:00000012:10:FEN_Inscription_Adhérant.BTN_Valider:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant$GWDBTN_Valider:Clic sur BTN_Valider
WDObjet _WDExpSelon0 = mWD_COMBO_Type.getProp(EWDPropriete.PROP_VALEURAFFICHEE);
if(_WDExpSelon0.opEgal("Patient"))
{
// 			SI HLitRecherche(patient,login_pt,SAI_Login_Pseudo,hIdentique)	 ALORS
//MAP:2244568d20ea823f:00000012:15:FEN_Inscription_Adhérant.BTN_Valider:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant$GWDBTN_Valider:Clic sur BTN_Valider
if(WDAPIHF.hLitRecherche(WDAPIHF.getFichierSansCasseNiAccent("patient"),WDAPIHF.getRubriqueSansCasseNiAccent("login_pt"),mWD_SAI_Login_Pseudo,(long)524288).getBoolean())
{
// 				Info("Pseudo déjà enregistré")
//MAP:2244568d20ea823f:00000012:17:FEN_Inscription_Adhérant.BTN_Valider:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant$GWDBTN_Valider:Clic sur BTN_Valider
WDAPIDialogue.info("Pseudo déjà enregistré");

}
else
{
// 					patient.login_pt = SAI_Login_Pseudo
//MAP:2244568d20ea823f:00000012:1b:FEN_Inscription_Adhérant.BTN_Valider:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant$GWDBTN_Valider:Clic sur BTN_Valider
WDAPIHF.getFichierSansCasseNiAccent("patient").getRubriqueSansCasseNiAccent("login_pt").setValeur(mWD_SAI_Login_Pseudo);

// 					patient.passe_pt = SAI_Mot_de_passe
//MAP:2244568d20ea823f:00000012:1c:FEN_Inscription_Adhérant.BTN_Valider:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant$GWDBTN_Valider:Clic sur BTN_Valider
WDAPIHF.getFichierSansCasseNiAccent("patient").getRubriqueSansCasseNiAccent("passe_pt").setValeur(mWD_SAI_Mot_de_passe);

// 					patient.nom_pt = SAI_Nom
//MAP:2244568d20ea823f:00000012:1d:FEN_Inscription_Adhérant.BTN_Valider:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant$GWDBTN_Valider:Clic sur BTN_Valider
WDAPIHF.getFichierSansCasseNiAccent("patient").getRubriqueSansCasseNiAccent("nom_pt").setValeur(mWD_SAI_Nom);

// 					patient.prenom_pt = SAI_Prénom
//MAP:2244568d20ea823f:00000012:1e:FEN_Inscription_Adhérant.BTN_Valider:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant$GWDBTN_Valider:Clic sur BTN_Valider
WDAPIHF.getFichierSansCasseNiAccent("patient").getRubriqueSansCasseNiAccent("prenom_pt").setValeur(mWD_SAI_Prenom);

// 					patient.annee_naissance_pt = SAI_Année_Naissance
//MAP:2244568d20ea823f:00000012:1f:FEN_Inscription_Adhérant.BTN_Valider:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant$GWDBTN_Valider:Clic sur BTN_Valider
WDAPIHF.getFichierSansCasseNiAccent("patient").getRubriqueSansCasseNiAccent("annee_naissance_pt").setValeur(mWD_SAI_Annee_Naissance);

// 					HAjoute(patient)
//MAP:2244568d20ea823f:00000012:20:FEN_Inscription_Adhérant.BTN_Valider:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant$GWDBTN_Valider:Clic sur BTN_Valider
WDAPIHF.hAjoute(WDAPIHF.getFichierSansCasseNiAccent("patient"));

// 					InitFenêtre()
//MAP:2244568d20ea823f:00000012:22:FEN_Inscription_Adhérant.BTN_Valider:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant$GWDBTN_Valider:Clic sur BTN_Valider
WDAPIFenetre.initFenetre();

// 					Info("Ajouté avec succès")	
//MAP:2244568d20ea823f:00000012:23:FEN_Inscription_Adhérant.BTN_Valider:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant$GWDBTN_Valider:Clic sur BTN_Valider
WDAPIDialogue.info("Ajouté avec succès");

}

}
else if(_WDExpSelon0.opEgal("Parrain"))
{
// 				SI (AnnéeEnCours() - SAI_Année_Naissance) <12 ALORS
//MAP:2244568d20ea823f:00000012:2c:FEN_Inscription_Adhérant.BTN_Valider:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant$GWDBTN_Valider:Clic sur BTN_Valider
if(WDAPIDate.anneeEnCours().opMoins(mWD_SAI_Annee_Naissance).opInf(12))
{
// 					Info("Année erronée","Vous devez avoir 12 et plus")
//MAP:2244568d20ea823f:00000012:2e:FEN_Inscription_Adhérant.BTN_Valider:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant$GWDBTN_Valider:Clic sur BTN_Valider
WDAPIDialogue.info("Année erronée",new String[] {"Vous devez avoir 12 et plus"} );

}
else
{
// 					SI INT_age= Faux ALORS
//MAP:2244568d20ea823f:00000012:34:FEN_Inscription_Adhérant.BTN_Valider:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant$GWDBTN_Valider:Clic sur BTN_Valider
if(mWD_INT_age.opEgal(false))
{
// 						Info("vous devez accepter la condition d'âge") 
//MAP:2244568d20ea823f:00000012:36:FEN_Inscription_Adhérant.BTN_Valider:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant$GWDBTN_Valider:Clic sur BTN_Valider
WDAPIDialogue.info("vous devez accepter la condition d'âge");

}
else
{
// 			    SI HLitRecherche(parrain,login_pr,SAI_Login_Pseudo,hIdentique)	 ALORS
//MAP:2244568d20ea823f:00000012:3e:FEN_Inscription_Adhérant.BTN_Valider:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant$GWDBTN_Valider:Clic sur BTN_Valider
if(WDAPIHF.hLitRecherche(WDAPIHF.getFichierSansCasseNiAccent("parrain"),WDAPIHF.getRubriqueSansCasseNiAccent("login_pr"),mWD_SAI_Login_Pseudo,(long)524288).getBoolean())
{
// 				Info("Pseudo déjà enregistré")
//MAP:2244568d20ea823f:00000012:40:FEN_Inscription_Adhérant.BTN_Valider:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant$GWDBTN_Valider:Clic sur BTN_Valider
WDAPIDialogue.info("Pseudo déjà enregistré");

}
else
{
// 				parrain.login_pr = SAI_Login_Pseudo
//MAP:2244568d20ea823f:00000012:45:FEN_Inscription_Adhérant.BTN_Valider:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant$GWDBTN_Valider:Clic sur BTN_Valider
WDAPIHF.getFichierSansCasseNiAccent("parrain").getRubriqueSansCasseNiAccent("login_pr").setValeur(mWD_SAI_Login_Pseudo);

// 				parrain.passe_pr = SAI_Mot_de_passe
//MAP:2244568d20ea823f:00000012:46:FEN_Inscription_Adhérant.BTN_Valider:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant$GWDBTN_Valider:Clic sur BTN_Valider
WDAPIHF.getFichierSansCasseNiAccent("parrain").getRubriqueSansCasseNiAccent("passe_pr").setValeur(mWD_SAI_Mot_de_passe);

// 				parrain.nom_pr	= SAI_Nom
//MAP:2244568d20ea823f:00000012:47:FEN_Inscription_Adhérant.BTN_Valider:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant$GWDBTN_Valider:Clic sur BTN_Valider
WDAPIHF.getFichierSansCasseNiAccent("parrain").getRubriqueSansCasseNiAccent("nom_pr").setValeur(mWD_SAI_Nom);

// 				parrain.prenom_pr	= SAI_Prénom
//MAP:2244568d20ea823f:00000012:48:FEN_Inscription_Adhérant.BTN_Valider:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant$GWDBTN_Valider:Clic sur BTN_Valider
WDAPIHF.getFichierSansCasseNiAccent("parrain").getRubriqueSansCasseNiAccent("prenom_pr").setValeur(mWD_SAI_Prenom);

// 				parrain.annee_naissance_pr = SAI_Année_Naissance
//MAP:2244568d20ea823f:00000012:49:FEN_Inscription_Adhérant.BTN_Valider:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant$GWDBTN_Valider:Clic sur BTN_Valider
WDAPIHF.getFichierSansCasseNiAccent("parrain").getRubriqueSansCasseNiAccent("annee_naissance_pr").setValeur(mWD_SAI_Annee_Naissance);

// 				HAjoute(parrain)
//MAP:2244568d20ea823f:00000012:4b:FEN_Inscription_Adhérant.BTN_Valider:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant$GWDBTN_Valider:Clic sur BTN_Valider
WDAPIHF.hAjoute(WDAPIHF.getFichierSansCasseNiAccent("parrain"));

// 				InitFenêtre()
//MAP:2244568d20ea823f:00000012:4d:FEN_Inscription_Adhérant.BTN_Valider:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant$GWDBTN_Valider:Clic sur BTN_Valider
WDAPIFenetre.initFenetre();

// 				Info("Ajouté avec succès")
//MAP:2244568d20ea823f:00000012:4e:FEN_Inscription_Adhérant.BTN_Valider:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant$GWDBTN_Valider:Clic sur BTN_Valider
WDAPIDialogue.info("Ajouté avec succès");

}

}

}

// 				INT_age..Visible					= Faux
//MAP:2244568d20ea823f:00000012:60:FEN_Inscription_Adhérant.BTN_Valider:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant$GWDBTN_Valider:Clic sur BTN_Valider
mWD_INT_age.setProp(EWDPropriete.PROP_VISIBLE,false);

// 				LIB_Je_confirme_avoir_plus..Visible	= Faux 
//MAP:2244568d20ea823f:00000012:61:FEN_Inscription_Adhérant.BTN_Valider:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant$GWDBTN_Valider:Clic sur BTN_Valider
mWD_LIB_Je_confirme_avoir_plus.setProp(EWDPropriete.PROP_VISIBLE,false);

}
else {
}

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
 * COMBO_Type
 */
class GWDCOMBO_Type extends WDCombo
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FEN_Inscription_Adhérant.COMBO_Type
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,87,40);
super.setRectCompPrincipal(87,2,222,40);
super.setQuid(2469193659848753742l);

super.setChecksum("1127668179");

super.setNom("COMBO_Type");

super.setType(10002);

super.setBulle("");

super.setLibelle("Type");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(8, 8);

super.setTailleInitiale(311, 44);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setContenuInitial("Patient\r\nParrain");

super.setTriee(false);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(1);

super.setLettreAppel(65535);

super.setRetourneValeurProgrammation(false);

super.setPersistant(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x262626, creerPolice_GEN("Roboto", -8.000000, 0), -2, 0, 0x808080);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xF1000000, 0xF3000000, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("F:\\Santé\\Phoenix_Combo@dpi1x.png?E5_3NP_30_8_26_8", new int[] {1,2,1,4,2,4,1,2,1}, new int[] {8, 26, 8, 30}, 0xFFFFFFFF, 1, 5));

super.setStyleElement(0x262626, 0xFFFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 60);

super.setStyleSelection(0x0, 0xBABABA, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStyleBouton(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0xFFFFFFFF);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Sélection d'une ligne de COMBO_Type
 */
public void selectionLigne()
{
super.selectionLigne();

// 
//MAP:2244568d20ee824e:00000021:1:FEN_Inscription_Adhérant.COMBO_Type:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant$GWDCOMBO_Type:Sélection d'une ligne de COMBO_Type
// selon COMBO_Type..ValeurAffichée
//MAP:2244568d20ee824e:00000021:2:FEN_Inscription_Adhérant.COMBO_Type:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant$GWDCOMBO_Type:Sélection d'une ligne de COMBO_Type
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
// selon COMBO_Type..ValeurAffichée
//MAP:2244568d20ee824e:00000021:2:FEN_Inscription_Adhérant.COMBO_Type:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant$GWDCOMBO_Type:Sélection d'une ligne de COMBO_Type
WDObjet _WDExpSelon0 = this.getProp(EWDPropriete.PROP_VALEURAFFICHEE);
if(_WDExpSelon0.opEgal("Patient"))
{
// 	  INT_age..Visible                    = faux
//MAP:2244568d20ee824e:00000021:6:FEN_Inscription_Adhérant.COMBO_Type:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant$GWDCOMBO_Type:Sélection d'une ligne de COMBO_Type
mWD_INT_age.setProp(EWDPropriete.PROP_VISIBLE,false);

// 	  LIB_Je_confirme_avoir_plus..Visible = faux 	
//MAP:2244568d20ee824e:00000021:7:FEN_Inscription_Adhérant.COMBO_Type:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant$GWDCOMBO_Type:Sélection d'une ligne de COMBO_Type
mWD_LIB_Je_confirme_avoir_plus.setProp(EWDPropriete.PROP_VISIBLE,false);

}
else if(_WDExpSelon0.opEgal("Parrain"))
{
//     	INT_age..Visible                   = Vrai
//MAP:2244568d20ee824e:00000021:b:FEN_Inscription_Adhérant.COMBO_Type:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant$GWDCOMBO_Type:Sélection d'une ligne de COMBO_Type
mWD_INT_age.setProp(EWDPropriete.PROP_VISIBLE,true);

//     	LIB_Je_confirme_avoir_plus..visible= Vrai
//MAP:2244568d20ee824e:00000021:c:FEN_Inscription_Adhérant.COMBO_Type:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant$GWDCOMBO_Type:Sélection d'une ligne de COMBO_Type
mWD_LIB_Je_confirme_avoir_plus.setProp(EWDPropriete.PROP_VISIBLE,true);

}
else {
}

}

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurSelection();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCOMBO_Type mWD_COMBO_Type;

/**
 * SAI_Login_Pseudo
 */
class GWDSAI_Login_Pseudo extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de FEN_Inscription_Adhérant.SAI_Login_Pseudo
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,316,21);
super.setRectCompPrincipal(0,21,316,40);
super.setQuid(2469193659848884814l);

super.setChecksum("1127537771");

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

super.setPositionInitiale(8, 61);

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

super.setAltitude(6);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

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

super.setStyleLibelle(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0DCDA, 0x605C5A, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("F:\\Santé\\Phoenix_Edt@dpi1x.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFF, 1, 5));

super.setStyleSaisie(0x0, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStyleTexteIndication(0x8B8680, creerPolice_GEN("Roboto", -8.000000, 0), 0);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0xF48542, 0x740500, 0xFFFFFFFF, 4.000000, 4.000000, 1, 1), 0x68635F, "", 1);

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
// Déclaration des champs du fils n°7 de FEN_Inscription_Adhérant.SAI_Mot_de_passe
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,316,21);
super.setRectCompPrincipal(0,21,316,40);
super.setQuid(2469193659849015902l);

super.setChecksum("1127668946");

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

super.setPositionInitiale(8, 128);

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

super.setAltitude(7);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

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

super.setStyleLibelle(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0DCDA, 0x605C5A, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("F:\\Santé\\Phoenix_Edt@dpi1x.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFF, 1, 5));

super.setStyleSaisie(0x0, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStyleTexteIndication(0x8B8680, creerPolice_GEN("Roboto", -8.000000, 0), 0);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0xF48542, 0x740500, 0xFFFFFFFF, 4.000000, 4.000000, 1, 1), 0x68635F, "", 1);

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
 * INT_age
 */
class GWDINT_age extends WDInterrupteur
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°8 de FEN_Inscription_Adhérant.INT_age
////////////////////////////////////////////////////////////////////////////

/**
 * INT_age_Option_0
 */
class GWDINT_age_Option_0 extends WDCaseACocherNatif
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Inscription_Adhérant.INT_age.INT_age_Option_0
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setLibelle("");

super.setHauteurOption(0);

super.setStyleLibelleOption(0x262626, creerPolice_GEN("Roboto", -8.000000, 0));

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDINT_age_Option_0 mWD_INT_age_Option_0 = new GWDINT_age_Option_0();
/**
 * Initialise tous les champs de FEN_Inscription_Adhérant.INT_age
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Inscription_Adhérant.INT_age
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
super.ajouterOption(mWD_INT_age_Option_0);
positionnerOptions();
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,0,54,37);
super.setQuid(2488829180441017227l);

super.setChecksum("693788007");

super.setNom("INT_age");

super.setType(5);

super.setBulle("");

super.setLibelle("Interrupteur");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(8, 378);

super.setTailleInitiale(54, 37);

super.setValeurInitiale("0");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(8);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(7);

super.setLettreAppel(65535);

super.setPersistant(false);

super.setParamOptions(false, 1, true, true, false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x262626, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x808080);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xF1000000, 0xF3000000, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1));


super.setImageCoche("F:\\Santé\\Gabarits\\WM\\250 Phoenix\\Phoenix_CBox@dpi1x.png?E12_8O", 1);

activerEcoute();
initialiserSousObjets();
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
public GWDINT_age mWD_INT_age;

/**
 * LIB_Je_confirme_avoir_plus
 */
class GWDLIB_Je_confirme_avoir_plus extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°9 de FEN_Inscription_Adhérant.LIB_Je_confirme_avoir_plus
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2488829313588049010l);

super.setChecksum("696832733");

super.setNom("LIB_Je_confirme_avoir_plus");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("je confirme avoir plus de 12 ans");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(83, 386);

super.setTailleInitiale(229, 19);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(9);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x68635F, 0xFFFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0DCDA, 0x605C5A, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


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
public GWDLIB_Je_confirme_avoir_plus mWD_LIB_Je_confirme_avoir_plus;

/**
 * ACTB_ActionBar
 */
class GWDACTB_ActionBar extends WDActionBar
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Inscription_Adhérant.ACTB_ActionBar
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setNom("ACTB_ActionBar");

super.setNote("", "");

super.setParamBoutonGauche(true, 1, "", "");

super.setParamBoutonDroit(false, 0, "", "");

super.setStyleActionBar(0xFFFFFF, 0x616161, true);

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
 * Traitement: Déclarations globales de FEN_Inscription_Adhérant
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCÉDURE MaFenêtre()
//MAP:2244568020e150c3:00000000:1:FEN_Inscription_Adhérant:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant:Déclarations globales de FEN_Inscription_Adhérant
super.declarerGlobale(WD_tabParam, 0, 0);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;


}




/**
 * Traitement: Prise de focus de FEN_Inscription_Adhérant
 */
public void priseDeFocus()
{
super.priseDeFocus();

// INT_age..Visible					= Faux
//MAP:2244568020e150c3:0000000b:1:FEN_Inscription_Adhérant:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant:Prise de focus de FEN_Inscription_Adhérant
// INT_age..Visible					= Faux
//MAP:2244568020e150c3:0000000b:1:FEN_Inscription_Adhérant:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant:Prise de focus de FEN_Inscription_Adhérant
mWD_INT_age.setProp(EWDPropriete.PROP_VISIBLE,false);

// LIB_Je_confirme_avoir_plus..Visible	= Faux 
//MAP:2244568020e150c3:0000000b:2:FEN_Inscription_Adhérant:com.masociete.sante.wdgen.GWDFFEN_Inscription_Adherant:Prise de focus de FEN_Inscription_Adhérant
mWD_LIB_Je_confirme_avoir_plus.setProp(EWDPropriete.PROP_VISIBLE,false);

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurFocus();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre FEN_Inscription_Adhérant
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_SAI_Nom = new GWDSAI_Nom();
mWD_SAI_Prenom = new GWDSAI_Prenom();
mWD_SAI_Annee_Naissance = new GWDSAI_Annee_Naissance();
mWD_BTN_Valider = new GWDBTN_Valider();
mWD_COMBO_Type = new GWDCOMBO_Type();
mWD_SAI_Login_Pseudo = new GWDSAI_Login_Pseudo();
mWD_SAI_Mot_de_passe = new GWDSAI_Mot_de_passe();
mWD_INT_age = new GWDINT_age();
mWD_LIB_Je_confirme_avoir_plus = new GWDLIB_Je_confirme_avoir_plus();
mWD_ACTB_ActionBar = new GWDACTB_ActionBar();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_Inscription_Adhérant
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2469193604013314243l);

super.setChecksum("1131811132");

super.setNom("FEN_Inscription_Adhérant");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 495);

super.setTitre("Inscription");

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
// Initialisation des champs de FEN_Inscription_Adhérant
////////////////////////////////////////////////////////////////////////////
mWD_SAI_Nom.initialiserObjet();
super.ajouter("SAI_Nom", mWD_SAI_Nom);
mWD_SAI_Prenom.initialiserObjet();
super.ajouter("SAI_Prénom", mWD_SAI_Prenom);
mWD_SAI_Annee_Naissance.initialiserObjet();
super.ajouter("SAI_Année_Naissance", mWD_SAI_Annee_Naissance);
mWD_BTN_Valider.initialiserObjet();
super.ajouter("BTN_Valider", mWD_BTN_Valider);
mWD_COMBO_Type.initialiserObjet();
super.ajouter("COMBO_Type", mWD_COMBO_Type);
mWD_SAI_Login_Pseudo.initialiserObjet();
super.ajouter("SAI_Login_Pseudo", mWD_SAI_Login_Pseudo);
mWD_SAI_Mot_de_passe.initialiserObjet();
super.ajouter("SAI_Mot_de_passe", mWD_SAI_Mot_de_passe);
mWD_INT_age.initialiserObjet();
super.ajouter("INT_age", mWD_INT_age);
mWD_LIB_Je_confirme_avoir_plus.initialiserObjet();
super.ajouter("LIB_Je_confirme_avoir_plus", mWD_LIB_Je_confirme_avoir_plus);
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
return true;
}
/**
* Retourne Vrai si on doit appliquer un theme "dark" (sombre) ou Faux si on doit appliquer "light" (clair) à la fenêtre.
* Ce choix se base sur la couleur du libellé par défaut dans le gabarit de la fenêtre.
*/
public boolean isThemeDark()
{
return false;
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
return GWDPSante.getInstance().mWD_FEN_Inscription_Adherant;
}
}
/**
* Retourne le nom du gabarit associée à la fenêtre.
*/
public String getNomGabarit()
{
return "250 PHOENIX#WM";
}
}
