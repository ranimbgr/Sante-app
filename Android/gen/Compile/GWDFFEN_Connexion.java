/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_Connexion
 * Date : 05/06/2022 23:17:07
 * Version de wdjava.dll  : 25.0.221.6
 */


package com.masociete.sante.wdgen;


import com.masociete.sante.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.champs.combo.*;
import fr.pcsoft.wdjava.ui.champs.saisie.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_Connexion extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_Connexion
////////////////////////////////////////////////////////////////////////////

/**
 * BTN_Connexion
 */
class GWDBTN_Connexion extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Connexion.BTN_Connexion
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2469200376641707673l);

super.setChecksum("591512162");

super.setNom("BTN_Connexion");

super.setType(4);

super.setBulle("");

super.setLibelle("Connexion");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(106, 302);

super.setTailleInitiale(102, 36);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setNumTab(4);

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
 * Traitement: Clic sur BTN_Connexion
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// SI COMBO_Type..ValeurAffichée = "" OU SAI_Login_Pseudo = "" OU SAI_Mot_de_passe = "" ALORS
// SI COMBO_Type..ValeurAffichée = "" OU SAI_Login_Pseudo = "" OU SAI_Mot_de_passe = "" ALORS
if(((mWD_COMBO_Type.getProp(EWDPropriete.PROP_VALEURAFFICHEE).opEgal("") | mWD_SAI_Login_Pseudo.opEgal("")) | mWD_SAI_Mot_de_passe.opEgal("")))
{
// 	Info("Veuillez remplir tous les champs")
WDAPIDialogue.info("Veuillez remplir tous les champs");

}
else
{
// 	SELON COMBO_Type..ValeurAffichée
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
// 	SELON COMBO_Type..ValeurAffichée
WDObjet _WDExpSelon0 = mWD_COMBO_Type.getProp(EWDPropriete.PROP_VALEURAFFICHEE);
if(_WDExpSelon0.opEgal("Patient"))
{
// 			SI PAS HLitRecherche(patient,login_pt,SAI_Login_Pseudo,hIdentique)	 ALORS
if((!WDAPIHF.hLitRecherche(WDAPIHF.getFichierSansCasseNiAccent("patient"),WDAPIHF.getRubriqueSansCasseNiAccent("login_pt"),mWD_SAI_Login_Pseudo,(long)524288).getBoolean()))
{
// 				Info("Patient inéxistant")
WDAPIDialogue.info("Patient inéxistant");

}
else
{
// 					SI SAI_Mot_de_passe <> patient.passe_pt ALORS
if(mWD_SAI_Mot_de_passe.opDiff(WDAPIHF.getFichierSansCasseNiAccent("patient").getRubriqueSansCasseNiAccent("passe_pt")))
{
// 						Info("Mot de passe erroné")
WDAPIDialogue.info("Mot de passe erroné");

}
else
{
// 						SI HNbEnr(patient_local) = 0 ALORS
if(WDAPIHF.hNbEnr(WDAPIHF.getFichierSansCasseNiAccent("patient_local")).opEgal(0))
{
// 							patient_local.login = SAI_Login_Pseudo
WDAPIHF.getFichierSansCasseNiAccent("patient_local").getRubriqueSansCasseNiAccent("login").setValeur(mWD_SAI_Login_Pseudo);

// 							HAjoute(patient_local)
WDAPIHF.hAjoute(WDAPIHF.getFichierSansCasseNiAccent("patient_local"));

}
else
{
// 							HLitPremier(patient_local)
WDAPIHF.hLitPremier(WDAPIHF.getFichierSansCasseNiAccent("patient_local"));

// 							patient_local.login = SAI_Login_Pseudo
WDAPIHF.getFichierSansCasseNiAccent("patient_local").getRubriqueSansCasseNiAccent("login").setValeur(mWD_SAI_Login_Pseudo);

// 							HModifie(patient_local)
WDAPIHF.hModifie(WDAPIHF.getFichierSansCasseNiAccent("patient_local"));

}

// 						OuvreFenêtreMobile(FEN_patient,patient.login_pt)
WDAPIFenetre.ouvreFille(GWDPSante.getInstance().mWD_FEN_patient,new WDObjet[] {WDAPIHF.getFichierSansCasseNiAccent("patient").getRubriqueSansCasseNiAccent("login_pt")} );

}

}

}
else if(_WDExpSelon0.opEgal("Parrain"))
{
// 			SI PAS HLitRecherche(parrain,login_pr,SAI_Login_Pseudo,hIdentique)	 ALORS
if((!WDAPIHF.hLitRecherche(WDAPIHF.getFichierSansCasseNiAccent("parrain"),WDAPIHF.getRubriqueSansCasseNiAccent("login_pr"),mWD_SAI_Login_Pseudo,(long)524288).getBoolean()))
{
// 				Info("Parrain inéxistant")
WDAPIDialogue.info("Parrain inéxistant");

}
else
{
// 				SI SAI_Mot_de_passe <> parrain.passe_pr ALORS
if(mWD_SAI_Mot_de_passe.opDiff(WDAPIHF.getFichierSansCasseNiAccent("parrain").getRubriqueSansCasseNiAccent("passe_pr")))
{
// 					Info("Mot de passe erroné")
WDAPIDialogue.info("Mot de passe erroné");

}
else
{
// 					OuvreFenêtreMobile(FEN_parrain,parrain.login_pr)
WDAPIFenetre.ouvreFille(GWDPSante.getInstance().mWD_FEN_parrain,new WDObjet[] {WDAPIHF.getFichierSansCasseNiAccent("parrain").getRubriqueSansCasseNiAccent("login_pr")} );

}

}

}
else {
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
public GWDBTN_Connexion mWD_BTN_Connexion;

/**
 * COMBO_Type
 */
class GWDCOMBO_Type extends WDCombo
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Connexion.COMBO_Type
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,62,41);
super.setRectCompPrincipal(62,2,250,41);
super.setQuid(2469200376641773209l);

super.setChecksum("592510258");

super.setNom("COMBO_Type");

super.setType(10002);

super.setBulle("");

super.setLibelle("Type");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(0, 29);

super.setTailleInitiale(312, 45);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setContenuInitial("Patient\r\nParrain");

super.setTriee(false);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setNumTab(1);

super.setLettreAppel(65535);

super.setRetourneValeurProgrammation(false);

super.setPersistant(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x848282, creerPolice_GEN("Trebuchet MS", -8.000000, 0), -2, 0, 0x848282);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xBAA532, 0x3A2500, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("C:\\Users\\Ranim\\Desktop\\Santé - CS\\Gabarits\\WM\\180 Poulco\\Poulco_Combo.png?E5_3NP_32_6_42_6", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {6, 42, 6, 32}, 0xFFFFFF, 1, 5));

super.setStyleElement(0x848282, 0xFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 48);

super.setStyleSelection(0xBAA532, 0xEADFA5, creerPolice_GEN("Trebuchet MS", -8.000000, 0));

super.setStyleBouton(WDCadreFactory.creerCadre_GEN(1, 0xBAA532, 0x3A2500, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0xFFFFFFFF);

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
public GWDCOMBO_Type mWD_COMBO_Type;

/**
 * SAI_Login_Pseudo
 */
class GWDSAI_Login_Pseudo extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_Connexion.SAI_Login_Pseudo
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,304,21);
super.setRectCompPrincipal(0,21,304,40);
super.setQuid(2469200376641838745l);

super.setChecksum("591642322");

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

super.setPositionInitiale(8, 92);

super.setTailleInitiale(304, 63);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

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
public GWDSAI_Login_Pseudo mWD_SAI_Login_Pseudo;

/**
 * SAI_Mot_de_passe
 */
class GWDSAI_Mot_de_passe extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_Connexion.SAI_Mot_de_passe
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,304,21);
super.setRectCompPrincipal(0,21,304,40);
super.setQuid(2469200376641904281l);

super.setChecksum("591707945");

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

super.setPositionInitiale(8, 163);

super.setTailleInitiale(304, 63);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(true);

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
public GWDSAI_Mot_de_passe mWD_SAI_Mot_de_passe;

/**
 * ACTB_ActionBar
 */
class GWDACTB_ActionBar extends WDActionBar
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Connexion.ACTB_ActionBar
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
 * Traitement: Déclarations globales de FEN_Connexion
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCÉDURE MaFenêtre()
super.declarerGlobale(WD_tabParam, 0, 0);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;


}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre FEN_Connexion
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_BTN_Connexion = new GWDBTN_Connexion();
mWD_COMBO_Type = new GWDCOMBO_Type();
mWD_SAI_Login_Pseudo = new GWDSAI_Login_Pseudo();
mWD_SAI_Mot_de_passe = new GWDSAI_Mot_de_passe();
mWD_ACTB_ActionBar = new GWDACTB_ActionBar();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_Connexion
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2469200376641445529l);

super.setChecksum("596518203");

super.setNom("FEN_Connexion");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 495);

super.setTitre("Connexion");

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
// Initialisation des champs de FEN_Connexion
////////////////////////////////////////////////////////////////////////////
mWD_BTN_Connexion.initialiserObjet();
super.ajouter("BTN_Connexion", mWD_BTN_Connexion);
mWD_COMBO_Type.initialiserObjet();
super.ajouter("COMBO_Type", mWD_COMBO_Type);
mWD_SAI_Login_Pseudo.initialiserObjet();
super.ajouter("SAI_Login_Pseudo", mWD_SAI_Login_Pseudo);
mWD_SAI_Mot_de_passe.initialiserObjet();
super.ajouter("SAI_Mot_de_passe", mWD_SAI_Mot_de_passe);
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
return GWDPSante.getInstance().mWD_FEN_Connexion;
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
