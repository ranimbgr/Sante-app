/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_patient
 * Date : 30/05/2022 10:25:12
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
import fr.pcsoft.wdjava.ui.champs.combo.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.core.context.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.ui.champs.table.*;
import fr.pcsoft.wdjava.ui.champs.table.colonne.*;
import fr.pcsoft.wdjava.ui.style.degrade.*;
import fr.pcsoft.wdjava.ui.champs.image.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_patient extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_patient
////////////////////////////////////////////////////////////////////////////

/**
 * LIB_Pseudo
 */
class GWDLIB_Pseudo extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_patient.LIB_Pseudo
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2469206436843808678l);

super.setChecksum("594759466");

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
public GWDLIB_Pseudo mWD_LIB_Pseudo;

/**
 * SAI_Heure
 */
class GWDSAI_Heure extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_patient.SAI_Heure
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,49,40);
super.setRectCompPrincipal(49,2,74,40);
super.setQuid(2469212050375825203l);

super.setChecksum("604660353");

super.setNom("SAI_Heure");

super.setType(20003);

super.setBulle("");

super.setLibelle("Heure");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(9, 144);

super.setTailleInitiale(123, 44);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(2);

super.setMotDePasse(false);

super.setLiaisonFichier("traitement", "heure");

super.setTypeSaisie(3);

super.setFormatMemorise("HHMM");

super.setMasqueSaisie(new WDChaineU("HH:MM"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(2);

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

super.setMasqueAffichage(new WDChaineU("HH:MM"));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(6);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x262626, creerPolice_GEN("Roboto", -8.000000, 0), -2, 0, 0x808080);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("F:\\Santé\\Gabarits\\WM\\250 Phoenix\\Phoenix_Edt@dpi1x.png?E5_3NP_8_8_8_8", new int[] {1,2,1,2,2,2,1,2,1}, new int[] {8, 8, 8, 8}, 0xFFFFFFFF, 1, 5));

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
public GWDSAI_Heure mWD_SAI_Heure;

/**
 * SAI_Nb_Comprimé
 */
class GWDSAI_Nb_Comprime extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_patient.SAI_Nb_Comprimé
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,106,40);
super.setRectCompPrincipal(106,2,34,40);
super.setQuid(2469214279469941371l);

super.setChecksum("610657494");

super.setNom("SAI_Nb_Comprimé");

super.setType(20004);

super.setBulle("");

super.setLibelle("Nb Comprimé");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(173, 145);

super.setTailleInitiale(140, 44);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(2);

super.setMotDePasse(false);

super.setLiaisonFichier("traitement", "nb_cmp");

super.setTypeSaisie(1);

super.setMasqueSaisie(new WDChaineU("9.9"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(3);

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

super.setRetraitGauche(6);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x262626, creerPolice_GEN("Roboto", -8.000000, 0), -2, 0, 0x808080);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("F:\\Santé\\Gabarits\\WM\\250 Phoenix\\Phoenix_Edt@dpi1x.png?E5_3NP_8_8_8_8", new int[] {1,2,1,2,2,2,1,2,1}, new int[] {8, 8, 8, 8}, 0xFFFFFFFF, 1, 5));

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
public GWDSAI_Nb_Comprime mWD_SAI_Nb_Comprime;

/**
 * COMBO_Famille
 */
class GWDCOMBO_Famille extends WDComboFichierAccesDirect
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_patient.COMBO_Famille
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,104,40);
super.setRectCompPrincipal(104,2,200,40);
super.setQuid(2469221546569077710l);

super.setChecksum("626369712");

super.setNom("COMBO_Famille");

super.setType(10002);

super.setBulle("");

super.setLibelle("Famille");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(8, 40);

super.setTailleInitiale(304, 44);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setSourceRemplissage("famille", "nom_fam", "nom_fam", "nom_fam", true, "");

super.setContenuInitial("");

super.setTriee(false);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(1);

super.setLettreAppel(65535);

super.setRetourneValeurProgrammation(false);

super.setPersistant(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x262626, creerPolice_GEN("Roboto", -8.000000, 0), -2, 0, 0x808080);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xF1000000, 0xF3000000, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("F:\\Santé\\Gabarits\\WM\\250 Phoenix\\Phoenix_Combo@dpi1x.png?E5_3NP_30_8_26_8", new int[] {1,2,1,4,2,4,1,2,1}, new int[] {8, 26, 8, 30}, 0xFFFFFFFF, 1, 5));

super.setStyleElement(0x262626, 0xFFFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 60);

super.setStyleSelection(0x0, 0xBABABA, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStyleBouton(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0xFFFFFFFF);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Sélection d'une ligne de COMBO_Famille
 */
public void selectionLigne()
{
super.selectionLigne();

// 
//MAP:22446fea02fd93ce:00000021:1:FEN_patient.COMBO_Famille:com.masociete.sante.wdgen.GWDFFEN_patient$GWDCOMBO_Famille:Sélection d'une ligne de COMBO_Famille
// REQ_medicament_par_famille.ParamNom_fam = COMBO_Famille
//MAP:22446fea02fd93ce:00000021:2:FEN_patient.COMBO_Famille:com.masociete.sante.wdgen.GWDFFEN_patient$GWDCOMBO_Famille:Sélection d'une ligne de COMBO_Famille
WDAPIHF.getFichierSansCasseNiAccent("req_medicament_par_famille").getRubriqueSansCasseNiAccent("paramnom_fam").setValeur(this);

// HExécuteRequête(REQ_medicament_par_famille)
//MAP:22446fea02fd93ce:00000021:4:FEN_patient.COMBO_Famille:com.masociete.sante.wdgen.GWDFFEN_patient$GWDCOMBO_Famille:Sélection d'une ligne de COMBO_Famille
WDAPIHF.hExecuteRequete(WDAPIHF.getRequeteSansCasseNiAccent("req_medicament_par_famille"));

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
public GWDCOMBO_Famille mWD_COMBO_Famille;

/**
 * COMBO_REQ_medicament_famille
 */
class GWDCOMBO_REQ_medicament_famille extends WDComboFichierAccesDirect
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FEN_patient.COMBO_REQ_medicament_famille
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,104,40);
super.setRectCompPrincipal(104,2,200,40);
super.setQuid(2469223895916932731l);

super.setChecksum("628810368");

super.setNom("COMBO_REQ_medicament_famille");

super.setType(10002);

super.setBulle("");

super.setLibelle("Médicament");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(8, 93);

super.setTailleInitiale(304, 44);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setLiaisonFichier("traitement", "nom_med");

super.setSourceRemplissage("req_medicament_par_famille", "nom_med", "nom_med", "nom_med", true, "");

super.setContenuInitial("");

super.setTriee(false);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(2);

super.setLettreAppel(65535);

super.setRetourneValeurProgrammation(false);

super.setPersistant(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x262626, creerPolice_GEN("Roboto", -8.000000, 0), -2, 0, 0x808080);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xF1000000, 0xF3000000, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("F:\\Santé\\Gabarits\\WM\\250 Phoenix\\Phoenix_Combo@dpi1x.png?E5_3NP_30_8_26_8", new int[] {1,2,1,4,2,4,1,2,1}, new int[] {8, 26, 8, 30}, 0xFFFFFFFF, 1, 5));

super.setStyleElement(0x262626, 0xFFFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 60);

super.setStyleSelection(0x0, 0xBABABA, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStyleBouton(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0xFFFFFFFF);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Initialisation de COMBO_REQ_medicament_famille
 */
public void init()
//  Le champ utilise une requête paramétrée pour afficher ses données.
//  Les paramètres de cette requête doivent être définis avant ou lors de l'initialisation du champ.
//  La requête sera exécutée automatiquement si au moins un paramètre a été défini.
// 
//  Pour plus d'informations, veuillez consulter l'aide :
//  Requête paramétrée, Utilisation dans un champ Table, une Liste ou une Combo
// 
//  Paramètres de la requête 'REQ_medicament_famille'
{
super.init();

// // Le champ utilise une requête paramétrée pour afficher ses données.
//MAP:2244720d0308ee7b:0000000e:1:FEN_patient.COMBO_REQ_medicament_famille:com.masociete.sante.wdgen.GWDFFEN_patient$GWDCOMBO_REQ_medicament_famille:Initialisation de COMBO_REQ_medicament_famille
// MaSource.ParamNom_fam = "hypertension"
//MAP:2244720d0308ee7b:0000000e:9:FEN_patient.COMBO_REQ_medicament_famille:com.masociete.sante.wdgen.GWDFFEN_patient$GWDCOMBO_REQ_medicament_famille:Initialisation de COMBO_REQ_medicament_famille
WDContexte.getMaSource().get("ParamNom_fam").setValeur("hypertension");

}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCOMBO_REQ_medicament_famille mWD_COMBO_REQ_medicament_famille;

/**
 * BTN_Ajouter
 */
class GWDBTN_Ajouter extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de FEN_patient.BTN_Ajouter
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2474038906405171135l);

super.setChecksum("589055014");

super.setNom("BTN_Ajouter");

super.setType(4);

super.setBulle("");

super.setLibelle("Ajouter");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(232, 200);

super.setTailleInitiale(70, 36);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(6);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(5);

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

super.setImageFond("F:\\Santé\\Gabarits\\WM\\250 Phoenix\\Phoenix_Btn_Menu@dpi1_5x.png?E5_3NP_10_10_10_10", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_Ajouter
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// bTrouve est un booléen = Faux
//MAP:22558d4700c6afbf:00000012:1:FEN_patient.BTN_Ajouter:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Ajouter:Clic sur BTN_Ajouter

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_bTrouve = new WDBooleen();



// bTrouve est un booléen = Faux
//MAP:22558d4700c6afbf:00000012:1:FEN_patient.BTN_Ajouter:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Ajouter:Clic sur BTN_Ajouter

vWD_bTrouve.setValeur(false);


// si COMBO_REQ_medicament_famille = "" ou SAI_Heure = "" ou SAI_Nb_Comprimé = 0 ALORS
//MAP:22558d4700c6afbf:00000012:5:FEN_patient.BTN_Ajouter:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Ajouter:Clic sur BTN_Ajouter
if(((mWD_COMBO_REQ_medicament_famille.opEgal("") | mWD_SAI_Heure.opEgal("")) | mWD_SAI_Nb_Comprime.opEgal(0)))
{
// 	info("Veuillez remplir tous les champs")
//MAP:22558d4700c6afbf:00000012:7:FEN_patient.BTN_Ajouter:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Ajouter:Clic sur BTN_Ajouter
WDAPIDialogue.info("Veuillez remplir tous les champs");

}
else
{
// 	HLitPremier(Traitement)
//MAP:22558d4700c6afbf:00000012:15:FEN_patient.BTN_Ajouter:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Ajouter:Clic sur BTN_Ajouter
WDAPIHF.hLitPremier(WDAPIHF.getFichierSansCasseNiAccent("traitement"));

// 	tantque pas HEnDehors(Traitement) et bTrouve = Faux
//MAP:22558d4700c6afbf:00000012:16:FEN_patient.BTN_Ajouter:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Ajouter:Clic sur BTN_Ajouter
while(((!WDAPIHF.hEnDehors(WDAPIHF.getFichierSansCasseNiAccent("traitement")).getBoolean()) & vWD_bTrouve.opEgal(false)))
{
// 	si Traitement.Login_pt = LIB_Pseudo et Traitement.Nom_med = COMBO_REQ_medicament_famille et Traitement.Heure = SAI_Heure ALORS
//MAP:22558d4700c6afbf:00000012:1a:FEN_patient.BTN_Ajouter:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Ajouter:Clic sur BTN_Ajouter
if(((WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("login_pt").opEgal(mWD_LIB_Pseudo) & WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("nom_med").opEgal(mWD_COMBO_REQ_medicament_famille)) & WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("heure").opEgal(mWD_SAI_Heure)))
{
// 	bTrouve = Vrai
//MAP:22558d4700c6afbf:00000012:1e:FEN_patient.BTN_Ajouter:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Ajouter:Clic sur BTN_Ajouter
vWD_bTrouve.setValeur(true);

}

// 	HLitSuivant(Traitement)	
//MAP:22558d4700c6afbf:00000012:26:FEN_patient.BTN_Ajouter:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Ajouter:Clic sur BTN_Ajouter
WDAPIHF.hLitSuivant(WDAPIHF.getFichierSansCasseNiAccent("traitement"));

}

// 	si bTrouve ALORS
//MAP:22558d4700c6afbf:00000012:2b:FEN_patient.BTN_Ajouter:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Ajouter:Clic sur BTN_Ajouter
if(vWD_bTrouve.getBoolean())
{
// 		info("Ce traitement existe déjà")
//MAP:22558d4700c6afbf:00000012:2d:FEN_patient.BTN_Ajouter:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Ajouter:Clic sur BTN_Ajouter
WDAPIDialogue.info("Ce traitement existe déjà");

}
else
{
// 	EcranVersFichier(FEN_patient,Traitement)
//MAP:22558d4700c6afbf:00000012:32:FEN_patient.BTN_Ajouter:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Ajouter:Clic sur BTN_Ajouter
WDAPIFenetre.ecranVersFichier(GWDPSante.getInstance().mWD_FEN_patient,WDAPIHF.getFichierSansCasseNiAccent("traitement"));

// 	HAjoute(Traitement)
//MAP:22558d4700c6afbf:00000012:33:FEN_patient.BTN_Ajouter:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Ajouter:Clic sur BTN_Ajouter
WDAPIHF.hAjoute(WDAPIHF.getFichierSansCasseNiAccent("traitement"));

// 	COMBO_Famille = ""
//MAP:22558d4700c6afbf:00000012:35:FEN_patient.BTN_Ajouter:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Ajouter:Clic sur BTN_Ajouter
mWD_COMBO_Famille.setValeur("");

// 	COMBO_REQ_medicament_famille = ""
//MAP:22558d4700c6afbf:00000012:36:FEN_patient.BTN_Ajouter:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Ajouter:Clic sur BTN_Ajouter
mWD_COMBO_REQ_medicament_famille.setValeur("");

// 	SAI_Heure = ""
//MAP:22558d4700c6afbf:00000012:37:FEN_patient.BTN_Ajouter:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Ajouter:Clic sur BTN_Ajouter
mWD_SAI_Heure.setValeur("");

// 	SAI_Nb_Comprimé = ""
//MAP:22558d4700c6afbf:00000012:38:FEN_patient.BTN_Ajouter:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Ajouter:Clic sur BTN_Ajouter
mWD_SAI_Nb_Comprime.setValeur("");

// 	Info("Traitement validé avec succès")
//MAP:22558d4700c6afbf:00000012:3b:FEN_patient.BTN_Ajouter:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Ajouter:Clic sur BTN_Ajouter
WDAPIDialogue.info("Traitement validé avec succès");

// 	TableAffiche(TABLE_Traitement)
//MAP:22558d4700c6afbf:00000012:3d:FEN_patient.BTN_Ajouter:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Ajouter:Clic sur BTN_Ajouter
WDAPITable.tableAffiche(mWD_TABLE_Traitement);

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
public GWDBTN_Ajouter mWD_BTN_Ajouter;

/**
 * TABLE_Traitement
 */
class GWDTABLE_Traitement extends WDTableFichierAccesDirect
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de FEN_patient.TABLE_Traitement
////////////////////////////////////////////////////////////////////////////

/**
 * COL_Nom_med
 */
class GWDCOL_Nom_med extends WDColonneTexteSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_patient.TABLE_Traitement.COL_Nom_med
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2474041848475885987l);

super.setNom("COL_Nom_med");

super.setType(20001);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setLargeurInitiale(135);

super.setTitre("Médicament");

super.setLiaisonFichier("traitement", "nom_med");

super.setLargeurMin(14);

super.setVisibleInitial(true);

super.setTriable(true);

super.setDeplacable(true);

super.setTauxAncrageLargeur(0);

super.setAjustable(true);

super.setAvecRecherche(true);

super.setDessinBandeauSelection(true);

initChampAssocie();

super.terminerInitialisation();
}
protected void initChampAssocie()
{
super.setCadrageHorizontal(1);

super.setCadrageVertical(1);

super.setMotDePasse(false);

super.setTaille(50);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setEllipse(0);

super.setMasqueAffichage(new WDChaineU(""));

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCOL_Nom_med mWD_COL_Nom_med = new GWDCOL_Nom_med();

/**
 * COL_Heure
 */
class GWDCOL_Heure extends WDColonneTexteSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_patient.TABLE_Traitement.COL_Heure
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2474041848476017059l);

super.setNom("COL_Heure");

super.setType(20003);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setLargeurInitiale(73);

super.setTitre("Heure");

super.setLiaisonFichier("traitement", "heure");

super.setLargeurMin(14);

super.setVisibleInitial(true);

super.setTriable(true);

super.setDeplacable(true);

super.setTauxAncrageLargeur(0);

super.setAjustable(true);

super.setAvecRecherche(true);

super.setDessinBandeauSelection(true);

initChampAssocie();

super.terminerInitialisation();
}
protected void initChampAssocie()
{
super.setCadrageHorizontal(1);

super.setCadrageVertical(1);

super.setMotDePasse(false);

super.setTaille(0);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setTypeSaisie(3);

super.setFormatMemorise("HHMM");

super.setMasqueSaisie(new WDChaineU("HH:MM"));

super.setEllipse(0);

super.setMasqueAffichage(new WDChaineU("HH:MM"));

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(false);

}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCOL_Heure mWD_COL_Heure = new GWDCOL_Heure();

/**
 * COL_Nb_cmp
 */
class GWDCOL_Nb_cmp extends WDColonneTexteSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_patient.TABLE_Traitement.COL_Nb_cmp
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2474041848476148131l);

super.setNom("COL_Nb_cmp");

super.setType(20001);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setLargeurInitiale(110);

super.setTitre("Comprimé");

super.setLiaisonFichier("traitement", "nb_cmp");

super.setLargeurMin(14);

super.setVisibleInitial(true);

super.setTriable(true);

super.setDeplacable(true);

super.setTauxAncrageLargeur(0);

super.setAjustable(true);

super.setAvecRecherche(true);

super.setDessinBandeauSelection(true);

initChampAssocie();

super.terminerInitialisation();
}
protected void initChampAssocie()
{
super.setCadrageHorizontal(1);

super.setCadrageVertical(1);

super.setMotDePasse(false);

super.setTaille(50);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setEllipse(0);

super.setMasqueAffichage(new WDChaineU(""));

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCOL_Nb_cmp mWD_COL_Nb_cmp = new GWDCOL_Nb_cmp();
/**
 * Initialise tous les champs de FEN_patient.TABLE_Traitement
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_patient.TABLE_Traitement
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
super.ajouterColonne("COL_Nom_med",mWD_COL_Nom_med);
super.ajouterColonne("COL_Heure",mWD_COL_Heure);
super.ajouterColonne("COL_Nb_cmp",mWD_COL_Nb_cmp);
mWD_COL_Nom_med.initialiserObjet();
mWD_COL_Heure.initialiserObjet();
mWD_COL_Nb_cmp.initialiserObjet();

}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2474041848475689333l);

super.setChecksum("606978417");

super.setNom("TABLE_Traitement");

super.setType(9);

super.setBulle("");

super.setLibelle("Table Traitement");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(1, 256);

super.setTailleInitiale(320, 255);

super.setValeurInitiale("");

super.setPlan(0);

super.setSourceRemplissage("traitement", "nom_med", "", true, "", false);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(7);

super.setTailleCellule(26, 3, 3, 3, 3, 0);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setNumTab(8);

super.setModeAscenseur(1, 1);

super.setModeSelection(99);

super.setSaisieEnCascade(false);

super.setLettreAppel(65535);

super.setNumColonneAncree(1);

super.setEnregistrementSortieLigne(true);

super.setPersistant(true);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x0, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0xF1000000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setStyleSeparateurVerticaux(false, 0xFFFFFFFF);

super.setStyleSeparateurHorizontaux(0, 0xFFFFFFFF);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(1, 0xC6C6C6, 0x464646, 0xFFFFFF, 2.000000, 2.000000, 1, 1));

super.setDessinerLigneVide(true);

super.setCouleursLigne(0x262626, 0xFFFFFF, 0x262626, 0xF1000000);

super.setStyleSelection(0xFFFFFF, 0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStyleEnteteColonne(10, 1, WDCadreFactory.creerCadre_GEN(15, 0xBABABA, 0x3A3A3A, WDDegradeFactory.creerDegrade_GEN(new int[]{0x435BF4, 0x4933EB}, 90, null), 2.000000, 2.000000, 1, 1), creerPolice_GEN("Roboto", -8.000000, 0), 0x0, true, "F:\\Santé\\Gabarits\\WM\\250 Phoenix\\Phoenix_Table_ColPict@dpi1x.png");

super.setPoliceColonne(creerPolice_GEN("Roboto", -8.000000, 0));

super.setScrollRapideTable(false, null);

super.setBtnEnrouleDeroule(true);

super.setSwipe(0);

super.setNbMaxLignes(0);

super.setImagePlusMoins("F:\\Santé\\Gabarits\\WM\\250 Phoenix\\Phoenix_Break_Pict@dpi1x.png?E2_4O");

super.setMargeInterneEnteteColonne(0, 0, 0, 0);

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

/**
 * Traitement: Sélection d'une ligne de TABLE_Traitement
 */
public void selectionLigne()
{
super.selectionLigne();

// 
//MAP:22558ff401d82175:00000021:1:FEN_patient.TABLE_Traitement:com.masociete.sante.wdgen.GWDFFEN_patient$GWDTABLE_Traitement:Sélection d'une ligne de TABLE_Traitement
// HLitRecherche(medicament,nom_med,TABLE_Traitement.COL_Nom_med,hIdentique)
//MAP:22558ff401d82175:00000021:2:FEN_patient.TABLE_Traitement:com.masociete.sante.wdgen.GWDFFEN_patient$GWDTABLE_Traitement:Sélection d'une ligne de TABLE_Traitement
WDAPIHF.hLitRecherche(WDAPIHF.getFichierSansCasseNiAccent("medicament"),WDAPIHF.getRubriqueSansCasseNiAccent("nom_med"),mWD_COL_Nom_med,(long)524288);

// COMBO_Famille = medicament.Nom_fam
//MAP:22558ff401d82175:00000021:3:FEN_patient.TABLE_Traitement:com.masociete.sante.wdgen.GWDFFEN_patient$GWDTABLE_Traitement:Sélection d'une ligne de TABLE_Traitement
mWD_COMBO_Famille.setValeur(WDAPIHF.getFichierSansCasseNiAccent("medicament").getRubriqueSansCasseNiAccent("nom_fam"));

// REQ_medicament_par_famille.ParamNom_fam = medicament.Nom_fam
//MAP:22558ff401d82175:00000021:4:FEN_patient.TABLE_Traitement:com.masociete.sante.wdgen.GWDFFEN_patient$GWDTABLE_Traitement:Sélection d'une ligne de TABLE_Traitement
WDAPIHF.getFichierSansCasseNiAccent("req_medicament_par_famille").getRubriqueSansCasseNiAccent("paramnom_fam").setValeur(WDAPIHF.getFichierSansCasseNiAccent("medicament").getRubriqueSansCasseNiAccent("nom_fam"));

// HExécuteRequête(REQ_medicament_par_famille)
//MAP:22558ff401d82175:00000021:5:FEN_patient.TABLE_Traitement:com.masociete.sante.wdgen.GWDFFEN_patient$GWDTABLE_Traitement:Sélection d'une ligne de TABLE_Traitement
WDAPIHF.hExecuteRequete(WDAPIHF.getRequeteSansCasseNiAccent("req_medicament_par_famille"));

// COMBO_REQ_medicament_famille = TABLE_Traitement.COL_Nom_med
//MAP:22558ff401d82175:00000021:8:FEN_patient.TABLE_Traitement:com.masociete.sante.wdgen.GWDFFEN_patient$GWDTABLE_Traitement:Sélection d'une ligne de TABLE_Traitement
mWD_COMBO_REQ_medicament_famille.setValeur(mWD_COL_Nom_med);

// SAI_Heure = TABLE_Traitement.COL_Heure
//MAP:22558ff401d82175:00000021:9:FEN_patient.TABLE_Traitement:com.masociete.sante.wdgen.GWDFFEN_patient$GWDTABLE_Traitement:Sélection d'une ligne de TABLE_Traitement
mWD_SAI_Heure.setValeur(mWD_COL_Heure);

// SAI_Nb_Comprimé = TABLE_Traitement.COL_Nb_cmp
//MAP:22558ff401d82175:00000021:a:FEN_patient.TABLE_Traitement:com.masociete.sante.wdgen.GWDFFEN_patient$GWDTABLE_Traitement:Sélection d'une ligne de TABLE_Traitement
mWD_SAI_Nb_Comprime.setValeur(mWD_COL_Nb_cmp);

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurSelection();
}
protected final int getIdEnteteAt(int nColonne, int nLigne) {return 0;}
protected final String getLibelleEnteteFromId(int nId) {return null;}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDTABLE_Traitement mWD_TABLE_Traitement;

/**
 * BTN_Delete
 */
class GWDBTN_Delete extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°8 de FEN_patient.BTN_Delete
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2474404481213801462l);

super.setChecksum("666436826");

super.setNom("BTN_Delete");

super.setType(4);

super.setBulle("");

super.setLibelle("Delete");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(154, 201);

super.setTailleInitiale(70, 36);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(8);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

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

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x222222);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x222222);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x222222);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(2, 0x3643F4, 0x74, 0x3643F4, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(2, 0x3643F4, 0x74, 0x3643F4, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(2, 0x3643F4, 0x74, 0x3643F4, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,2,1,2,2,2,1,2,1}, 10, 10, 10, 10);

super.setImageFond("F:\\Santé\\Gabarits\\WM\\210 Material Design Red\\Material Design Red_Btn_Std@dpi160.png?E5_3NP_10_10_10_10", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_Delete
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// bTrouve est un booléen = Faux
//MAP:2256d9c4056223f6:00000012:1:FEN_patient.BTN_Delete:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Delete:Clic sur BTN_Delete

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_bTrouve = new WDBooleen();



// bTrouve est un booléen = Faux
//MAP:2256d9c4056223f6:00000012:1:FEN_patient.BTN_Delete:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Delete:Clic sur BTN_Delete

vWD_bTrouve.setValeur(false);


// si COMBO_REQ_medicament_famille = "" ou SAI_Heure = "" ALORS
//MAP:2256d9c4056223f6:00000012:5:FEN_patient.BTN_Delete:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Delete:Clic sur BTN_Delete
if((mWD_COMBO_REQ_medicament_famille.opEgal("") | mWD_SAI_Heure.opEgal("")))
{
// 	info("Veuillez remplir tous les champs")
//MAP:2256d9c4056223f6:00000012:7:FEN_patient.BTN_Delete:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Delete:Clic sur BTN_Delete
WDAPIDialogue.info("Veuillez remplir tous les champs");

}
else
{
// 	HLitPremier(Traitement)
//MAP:2256d9c4056223f6:00000012:c:FEN_patient.BTN_Delete:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Delete:Clic sur BTN_Delete
WDAPIHF.hLitPremier(WDAPIHF.getFichierSansCasseNiAccent("traitement"));

// 	tantque pas HEnDehors(Traitement) et bTrouve = Faux
//MAP:2256d9c4056223f6:00000012:d:FEN_patient.BTN_Delete:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Delete:Clic sur BTN_Delete
while(((!WDAPIHF.hEnDehors(WDAPIHF.getFichierSansCasseNiAccent("traitement")).getBoolean()) & vWD_bTrouve.opEgal(false)))
{
// 	si Traitement.Login_pt = LIB_Pseudo et Traitement.Nom_med = COMBO_REQ_medicament_famille et Traitement.Heure = SAI_Heure ALORS
//MAP:2256d9c4056223f6:00000012:11:FEN_patient.BTN_Delete:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Delete:Clic sur BTN_Delete
if(((WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("login_pt").opEgal(mWD_LIB_Pseudo) & WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("nom_med").opEgal(mWD_COMBO_REQ_medicament_famille)) & WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("heure").opEgal(mWD_SAI_Heure)))
{
// 			SELON Dialogue("Supprimer o/n ?")
//MAP:2256d9c4056223f6:00000012:13:FEN_patient.BTN_Delete:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Delete:Clic sur BTN_Delete
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
// 			SELON Dialogue("Supprimer o/n ?")
//MAP:2256d9c4056223f6:00000012:13:FEN_patient.BTN_Delete:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Delete:Clic sur BTN_Delete
WDObjet _WDExpSelon0 = WDAPIDialogue.dialogue(0);
if(_WDExpSelon0.opEgal(1))
{
// 					HSupprime(Traitement)	
//MAP:2256d9c4056223f6:00000012:17:FEN_patient.BTN_Delete:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Delete:Clic sur BTN_Delete
WDAPIHF.hSupprime(WDAPIHF.getFichierSansCasseNiAccent("traitement"));

// 					COMBO_Famille					= ""
//MAP:2256d9c4056223f6:00000012:18:FEN_patient.BTN_Delete:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Delete:Clic sur BTN_Delete
mWD_COMBO_Famille.setValeur("");

// 					COMBO_REQ_medicament_famille	= ""
//MAP:2256d9c4056223f6:00000012:19:FEN_patient.BTN_Delete:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Delete:Clic sur BTN_Delete
mWD_COMBO_REQ_medicament_famille.setValeur("");

// 					SAI_Heure						= ""
//MAP:2256d9c4056223f6:00000012:1a:FEN_patient.BTN_Delete:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Delete:Clic sur BTN_Delete
mWD_SAI_Heure.setValeur("");

// 					SAI_Nb_Comprimé					= ""
//MAP:2256d9c4056223f6:00000012:1b:FEN_patient.BTN_Delete:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Delete:Clic sur BTN_Delete
mWD_SAI_Nb_Comprime.setValeur("");

// 					Info("Traitement supprimé")
//MAP:2256d9c4056223f6:00000012:1e:FEN_patient.BTN_Delete:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Delete:Clic sur BTN_Delete
WDAPIDialogue.info("Traitement supprimé");

// 					TableAffiche(TABLE_Traitement)
//MAP:2256d9c4056223f6:00000012:20:FEN_patient.BTN_Delete:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Delete:Clic sur BTN_Delete
WDAPITable.tableAffiche(mWD_TABLE_Traitement);

}

}

// 			bTrouve = Vrai
//MAP:2256d9c4056223f6:00000012:26:FEN_patient.BTN_Delete:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Delete:Clic sur BTN_Delete
vWD_bTrouve.setValeur(true);

}

// 	HLitSuivant(Traitement)	
//MAP:2256d9c4056223f6:00000012:2e:FEN_patient.BTN_Delete:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Delete:Clic sur BTN_Delete
WDAPIHF.hLitSuivant(WDAPIHF.getFichierSansCasseNiAccent("traitement"));

}

// 	si bTrouve = faux ALORS
//MAP:2256d9c4056223f6:00000012:33:FEN_patient.BTN_Delete:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Delete:Clic sur BTN_Delete
if(vWD_bTrouve.opEgal(false))
{
// 		info("Ce traitement n'existe pas")
//MAP:2256d9c4056223f6:00000012:35:FEN_patient.BTN_Delete:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Delete:Clic sur BTN_Delete
WDAPIDialogue.info("Ce traitement n'existe pas");

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
public GWDBTN_Delete mWD_BTN_Delete;

/**
 * BTN_Valider_la_prise
 */
class GWDBTN_Valider_la_prise extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°9 de FEN_patient.BTN_Valider_la_prise
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2476944267123653214l);

super.setChecksum("616063278");

super.setNom("BTN_Valider_la_prise");

super.setType(4);

super.setBulle("");

super.setLibelle("Valider la prise");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(15, 202);

super.setTailleInitiale(132, 36);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(9);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(7);

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

super.setImageFond("F:\\Santé\\Gabarits\\WM\\250 Phoenix\\Phoenix_Btn_Menu@dpi1_5x.png?E5_3NP_10_10_10_10", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_Valider_la_prise
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// bTrouve est un booléen = Faux
//MAP:225fdfb002587a5e:00000012:1:FEN_patient.BTN_Valider_la_prise:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Valider_la_prise:Clic sur BTN_Valider_la_prise

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_bTrouve = new WDBooleen();



// bTrouve est un booléen = Faux
//MAP:225fdfb002587a5e:00000012:1:FEN_patient.BTN_Valider_la_prise:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Valider_la_prise:Clic sur BTN_Valider_la_prise

vWD_bTrouve.setValeur(false);


// si COMBO_REQ_medicament_famille = "" ou SAI_Heure = "" ou SAI_Nb_Comprimé = 0 ALORS
//MAP:225fdfb002587a5e:00000012:5:FEN_patient.BTN_Valider_la_prise:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Valider_la_prise:Clic sur BTN_Valider_la_prise
if(((mWD_COMBO_REQ_medicament_famille.opEgal("") | mWD_SAI_Heure.opEgal("")) | mWD_SAI_Nb_Comprime.opEgal(0)))
{
// 	info("Veuillez remplir tous les champs")
//MAP:225fdfb002587a5e:00000012:7:FEN_patient.BTN_Valider_la_prise:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Valider_la_prise:Clic sur BTN_Valider_la_prise
WDAPIDialogue.info("Veuillez remplir tous les champs");

}
else
{
// 	HLitPremier(Traitement)
//MAP:225fdfb002587a5e:00000012:c:FEN_patient.BTN_Valider_la_prise:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Valider_la_prise:Clic sur BTN_Valider_la_prise
WDAPIHF.hLitPremier(WDAPIHF.getFichierSansCasseNiAccent("traitement"));

// 	tantque pas HEnDehors(Traitement) et bTrouve = Faux
//MAP:225fdfb002587a5e:00000012:d:FEN_patient.BTN_Valider_la_prise:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Valider_la_prise:Clic sur BTN_Valider_la_prise
while(((!WDAPIHF.hEnDehors(WDAPIHF.getFichierSansCasseNiAccent("traitement")).getBoolean()) & vWD_bTrouve.opEgal(false)))
{
// 	si Traitement.Login_pt = LIB_Pseudo et Traitement.Nom_med = COMBO_REQ_medicament_famille et Traitement.Heure = SAI_Heure ALORS
//MAP:225fdfb002587a5e:00000012:11:FEN_patient.BTN_Valider_la_prise:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Valider_la_prise:Clic sur BTN_Valider_la_prise
if(((WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("login_pt").opEgal(mWD_LIB_Pseudo) & WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("nom_med").opEgal(mWD_COMBO_REQ_medicament_famille)) & WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("heure").opEgal(mWD_SAI_Heure)))
{
// 	bTrouve = Vrai
//MAP:225fdfb002587a5e:00000012:15:FEN_patient.BTN_Valider_la_prise:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Valider_la_prise:Clic sur BTN_Valider_la_prise
vWD_bTrouve.setValeur(true);

}

// 	HLitSuivant(Traitement)	
//MAP:225fdfb002587a5e:00000012:1d:FEN_patient.BTN_Valider_la_prise:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Valider_la_prise:Clic sur BTN_Valider_la_prise
WDAPIHF.hLitSuivant(WDAPIHF.getFichierSansCasseNiAccent("traitement"));

}

// 	si bTrouve = Faux ALORS
//MAP:225fdfb002587a5e:00000012:22:FEN_patient.BTN_Valider_la_prise:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Valider_la_prise:Clic sur BTN_Valider_la_prise
if(vWD_bTrouve.opEgal(false))
{
// 		info("Ce traitement n'existe pas")
//MAP:225fdfb002587a5e:00000012:24:FEN_patient.BTN_Valider_la_prise:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Valider_la_prise:Clic sur BTN_Valider_la_prise
WDAPIDialogue.info("Ce traitement n'existe pas");

}
else
{
// 	Prises_medicaments.date_prise_medicament = DateDuJour()
//MAP:225fdfb002587a5e:00000012:29:FEN_patient.BTN_Valider_la_prise:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Valider_la_prise:Clic sur BTN_Valider_la_prise
WDAPIHF.getFichierSansCasseNiAccent("prises_medicaments").getRubriqueSansCasseNiAccent("date_prise_medicament").setValeur(WDAPIDate.dateDuJour());

// 	Prises_medicaments.heure_prise_medicament = HeureSys()
//MAP:225fdfb002587a5e:00000012:2a:FEN_patient.BTN_Valider_la_prise:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Valider_la_prise:Clic sur BTN_Valider_la_prise
WDAPIHF.getFichierSansCasseNiAccent("prises_medicaments").getRubriqueSansCasseNiAccent("heure_prise_medicament").setValeur(WDAPIDate.heureSys());

// 	Prises_medicaments.Login_pt = LIB_Pseudo
//MAP:225fdfb002587a5e:00000012:2b:FEN_patient.BTN_Valider_la_prise:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Valider_la_prise:Clic sur BTN_Valider_la_prise
WDAPIHF.getFichierSansCasseNiAccent("prises_medicaments").getRubriqueSansCasseNiAccent("login_pt").setValeur(mWD_LIB_Pseudo);

// 	Prises_medicaments.Nom_med = COMBO_REQ_medicament_famille
//MAP:225fdfb002587a5e:00000012:2c:FEN_patient.BTN_Valider_la_prise:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Valider_la_prise:Clic sur BTN_Valider_la_prise
WDAPIHF.getFichierSansCasseNiAccent("prises_medicaments").getRubriqueSansCasseNiAccent("nom_med").setValeur(mWD_COMBO_REQ_medicament_famille);

// 	Prises_medicaments.Heure = SAI_Heure
//MAP:225fdfb002587a5e:00000012:2d:FEN_patient.BTN_Valider_la_prise:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Valider_la_prise:Clic sur BTN_Valider_la_prise
WDAPIHF.getFichierSansCasseNiAccent("prises_medicaments").getRubriqueSansCasseNiAccent("heure").setValeur(mWD_SAI_Heure);

// 	HAjoute(Prises_medicaments)
//MAP:225fdfb002587a5e:00000012:2f:FEN_patient.BTN_Valider_la_prise:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Valider_la_prise:Clic sur BTN_Valider_la_prise
WDAPIHF.hAjoute(WDAPIHF.getFichierSansCasseNiAccent("prises_medicaments"));

// 	COMBO_Famille = ""
//MAP:225fdfb002587a5e:00000012:31:FEN_patient.BTN_Valider_la_prise:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Valider_la_prise:Clic sur BTN_Valider_la_prise
mWD_COMBO_Famille.setValeur("");

// 	COMBO_REQ_medicament_famille = ""
//MAP:225fdfb002587a5e:00000012:32:FEN_patient.BTN_Valider_la_prise:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Valider_la_prise:Clic sur BTN_Valider_la_prise
mWD_COMBO_REQ_medicament_famille.setValeur("");

// 	SAI_Heure = ""
//MAP:225fdfb002587a5e:00000012:33:FEN_patient.BTN_Valider_la_prise:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Valider_la_prise:Clic sur BTN_Valider_la_prise
mWD_SAI_Heure.setValeur("");

// 	SAI_Nb_Comprimé = ""
//MAP:225fdfb002587a5e:00000012:34:FEN_patient.BTN_Valider_la_prise:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Valider_la_prise:Clic sur BTN_Valider_la_prise
mWD_SAI_Nb_Comprime.setValeur("");

// 	Info("Prise enregistrée avec succès")
//MAP:225fdfb002587a5e:00000012:37:FEN_patient.BTN_Valider_la_prise:com.masociete.sante.wdgen.GWDFFEN_patient$GWDBTN_Valider_la_prise:Clic sur BTN_Valider_la_prise
WDAPIDialogue.info("Prise enregistrée avec succès");

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
public GWDBTN_Valider_la_prise mWD_BTN_Valider_la_prise;

/**
 * IMG_param
 */
class GWDIMG_param extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°10 de FEN_patient.IMG_param
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2486289269874541577l);

super.setChecksum("641590580");

super.setNom("IMG_param");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(274, 3);

super.setTailleInitiale(36, 36);

super.setValeurInitiale("F:\\Santé\\IMG-Double-Ancrage.svg");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(10);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 9, false, 75, true, false);

super.setAnimationInitiale(true);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur IMG_param
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// 
//MAP:228112eb03bcc409:00000012:1:FEN_patient.IMG_param:com.masociete.sante.wdgen.GWDFFEN_patient$GWDIMG_param:Clic sur IMG_param
// OuvreFenêtreMobile(FEN_patient_param,LIB_Pseudo)
//MAP:228112eb03bcc409:00000012:2:FEN_patient.IMG_param:com.masociete.sante.wdgen.GWDFFEN_patient$GWDIMG_param:Clic sur IMG_param
WDAPIFenetre.ouvreFille(GWDPSante.getInstance().mWD_FEN_patient_param,new WDObjet[] {mWD_LIB_Pseudo} );

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
public GWDIMG_param mWD_IMG_param;

/**
 * IMG_Parrain
 */
class GWDIMG_Parrain extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°11 de FEN_patient.IMG_Parrain
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2486308103333522565l);

super.setChecksum("668982993");

super.setNom("IMG_Parrain");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(3, 0);

super.setTailleInitiale(35, 43);

super.setValeurInitiale("F:\\Santé\\personne.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(11);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur IMG_Parrain
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// 
//MAP:2281240c055eac85:00000012:1:FEN_patient.IMG_Parrain:com.masociete.sante.wdgen.GWDFFEN_patient$GWDIMG_Parrain:Clic sur IMG_Parrain
// OuvreFenêtreMobile(FEN_affectation_patient_parrain,LIB_Pseudo)
//MAP:2281240c055eac85:00000012:2:FEN_patient.IMG_Parrain:com.masociete.sante.wdgen.GWDFFEN_patient$GWDIMG_Parrain:Clic sur IMG_Parrain
WDAPIFenetre.ouvreFille(GWDPSante.getInstance().mWD_FEN_affectation_patient_parrain,new WDObjet[] {mWD_LIB_Pseudo} );

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
public GWDIMG_Parrain mWD_IMG_Parrain;

/**
 * ACTB_ActionBar
 */
class GWDACTB_ActionBar extends WDActionBar
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_patient.ACTB_ActionBar
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
 * Traitement: Déclarations globales de FEN_patient
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCÉDURE MaFenêtre(gsPseudo est une chaîne)
//MAP:22445e0a0113c383:00000000:1:FEN_patient:com.masociete.sante.wdgen.GWDFFEN_patient:Déclarations globales de FEN_patient
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
 * Traitement: Prise de focus de FEN_patient
 */
public void priseDeFocus()
{
super.priseDeFocus();

// 
//MAP:22445e0a0113c383:0000000b:1:FEN_patient:com.masociete.sante.wdgen.GWDFFEN_patient:Prise de focus de FEN_patient
// LIB_Pseudo = gsPseudo
//MAP:22445e0a0113c383:0000000b:2:FEN_patient:com.masociete.sante.wdgen.GWDFFEN_patient:Prise de focus de FEN_patient
mWD_LIB_Pseudo.setValeur(vWD_gsPseudo);

// HFiltreIdentique(Traitement,Login_pt,LIB_Pseudo)
//MAP:22445e0a0113c383:0000000b:4:FEN_patient:com.masociete.sante.wdgen.GWDFFEN_patient:Prise de focus de FEN_patient
WDAPIHF.hFiltreIdentique(WDAPIHF.getFichierSansCasseNiAccent("traitement"),WDAPIHF.getRubriqueSansCasseNiAccent("login_pt"),mWD_LIB_Pseudo);

// TableAffiche(TABLE_Traitement)
//MAP:22445e0a0113c383:0000000b:5:FEN_patient:com.masociete.sante.wdgen.GWDFFEN_patient:Prise de focus de FEN_patient
WDAPITable.tableAffiche(mWD_TABLE_Traitement);

// TimerSys(watchdog_patient,10s,1)
//MAP:22445e0a0113c383:0000000b:7:FEN_patient:com.masociete.sante.wdgen.GWDFFEN_patient:Prise de focus de FEN_patient
WDAPITimer.timerSys((new WDChaineU("COL_ProcéduresGlobales.watchdog_patient")),(new WDDuree("0000010000")),(long)1);

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
// Création des champs de la fenêtre FEN_patient
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_LIB_Pseudo = new GWDLIB_Pseudo();
mWD_SAI_Heure = new GWDSAI_Heure();
mWD_SAI_Nb_Comprime = new GWDSAI_Nb_Comprime();
mWD_COMBO_Famille = new GWDCOMBO_Famille();
mWD_COMBO_REQ_medicament_famille = new GWDCOMBO_REQ_medicament_famille();
mWD_BTN_Ajouter = new GWDBTN_Ajouter();
mWD_TABLE_Traitement = new GWDTABLE_Traitement();
mWD_BTN_Delete = new GWDBTN_Delete();
mWD_BTN_Valider_la_prise = new GWDBTN_Valider_la_prise();
mWD_IMG_param = new GWDIMG_param();
mWD_IMG_Parrain = new GWDIMG_Parrain();
mWD_ACTB_ActionBar = new GWDACTB_ActionBar();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_patient
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2469201892766630787l);

super.setChecksum("598248326");

super.setNom("FEN_patient");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xF1000000);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 495);

super.setTitre("patient");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPositionFenetre(1);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("", 1, 0, 1);

super.setCouleurTexteAutomatique(0x0);

super.setCouleurBarreSysteme(0xFF000001);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_patient
////////////////////////////////////////////////////////////////////////////
mWD_LIB_Pseudo.initialiserObjet();
super.ajouter("LIB_Pseudo", mWD_LIB_Pseudo);
mWD_SAI_Heure.initialiserObjet();
super.ajouter("SAI_Heure", mWD_SAI_Heure);
mWD_SAI_Nb_Comprime.initialiserObjet();
super.ajouter("SAI_Nb_Comprimé", mWD_SAI_Nb_Comprime);
mWD_COMBO_Famille.initialiserObjet();
super.ajouter("COMBO_Famille", mWD_COMBO_Famille);
mWD_COMBO_REQ_medicament_famille.initialiserObjet();
super.ajouter("COMBO_REQ_medicament_famille", mWD_COMBO_REQ_medicament_famille);
mWD_BTN_Ajouter.initialiserObjet();
super.ajouter("BTN_Ajouter", mWD_BTN_Ajouter);
mWD_TABLE_Traitement.initialiserObjet();
super.ajouter("TABLE_Traitement", mWD_TABLE_Traitement);
mWD_BTN_Delete.initialiserObjet();
super.ajouter("BTN_Delete", mWD_BTN_Delete);
mWD_BTN_Valider_la_prise.initialiserObjet();
super.ajouter("BTN_Valider_la_prise", mWD_BTN_Valider_la_prise);
mWD_IMG_param.initialiserObjet();
super.ajouter("IMG_param", mWD_IMG_param);
mWD_IMG_Parrain.initialiserObjet();
super.ajouter("IMG_Parrain", mWD_IMG_Parrain);
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
return GWDPSante.getInstance().mWD_FEN_patient;
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
