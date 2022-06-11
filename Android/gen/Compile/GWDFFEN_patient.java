/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_patient
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

super.setPositionInitiale(34, 7);

super.setTailleInitiale(245, 19);

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

super.setMasqueAffichage(new WDChaineU("HH:MM"));

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

/**
 * Traitement: Sélection d'une ligne de COMBO_Famille
 */
public void selectionLigne()
{
super.selectionLigne();

// 
// REQ_medicament_par_famille.ParamNom_fam = COMBO_Famille
WDAPIHF.getFichierSansCasseNiAccent("req_medicament_par_famille").getRubriqueSansCasseNiAccent("paramnom_fam").setValeur(this);

// HExécuteRequête(REQ_medicament_par_famille)
WDAPIHF.hExecuteRequete(WDAPIHF.getRequeteSansCasseNiAccent("req_medicament_par_famille"));

// ListeAffiche(COMBO_REQ_medicament_famille)
WDAPIListe.listeAffiche(mWD_COMBO_REQ_medicament_famille);

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

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setNumTab(2);

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
// MaSource.ParamNom_fam = "hypertension"
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

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

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
 * Traitement: Clic sur BTN_Ajouter
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// bTrouve est un booléen = Faux

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_bTrouve = new WDBooleen();



// bTrouve est un booléen = Faux

vWD_bTrouve.setValeur(false);


// si COMBO_REQ_medicament_famille = "" ou SAI_Heure = "" ou SAI_Nb_Comprimé = 0 ALORS
if(((mWD_COMBO_REQ_medicament_famille.opEgal("") | mWD_SAI_Heure.opEgal("")) | mWD_SAI_Nb_Comprime.opEgal(0)))
{
// 	info("Veuillez remplir tous les champs")
WDAPIDialogue.info("Veuillez remplir tous les champs");

}
else
{
// 	HLitPremier(Traitement)
WDAPIHF.hLitPremier(WDAPIHF.getFichierSansCasseNiAccent("traitement"));

// 	tantque pas HEnDehors(Traitement) et bTrouve = Faux
while(((!WDAPIHF.hEnDehors(WDAPIHF.getFichierSansCasseNiAccent("traitement")).getBoolean()) & vWD_bTrouve.opEgal(false)))
{
// 	si Traitement.Login_pt = LIB_Pseudo et Traitement.Nom_med = COMBO_REQ_medicament_famille et Traitement.Heure = SAI_Heure ALORS
if(((WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("login_pt").opEgal(mWD_LIB_Pseudo) & WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("nom_med").opEgal(mWD_COMBO_REQ_medicament_famille)) & WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("heure").opEgal(mWD_SAI_Heure)))
{
// 	bTrouve = Vrai
vWD_bTrouve.setValeur(true);

}

// 	HLitSuivant(Traitement)	
WDAPIHF.hLitSuivant(WDAPIHF.getFichierSansCasseNiAccent("traitement"));

}

// 	si bTrouve ALORS
if(vWD_bTrouve.getBoolean())
{
// 		info("Ce traitement existe déjà")
WDAPIDialogue.info("Ce traitement existe déjà");

}
else
{
// 	EcranVersFichier(FEN_patient,Traitement)
WDAPIFenetre.ecranVersFichier(GWDPSante.getInstance().mWD_FEN_patient,WDAPIHF.getFichierSansCasseNiAccent("traitement"));

// 	HAjoute(Traitement)
WDAPIHF.hAjoute(WDAPIHF.getFichierSansCasseNiAccent("traitement"));

// 	COMBO_Famille = ""
mWD_COMBO_Famille.setValeur("");

// 	COMBO_REQ_medicament_famille = ""
mWD_COMBO_REQ_medicament_famille.setValeur("");

// 	SAI_Heure = ""
mWD_SAI_Heure.setValeur("");

// 	SAI_Nb_Comprimé = ""
mWD_SAI_Nb_Comprime.setValeur("");

// 	Info("Traitement validé avec succès")
WDAPIDialogue.info("Traitement validé avec succès");

// 	TableAffiche(TABLE_Traitement)
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

super.setPositionInitiale(1, 244);

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

super.setStyleLibelle(0x848282, creerPolice_GEN("Trebuchet MS", -8.000000, 0), -1, 0, 0xF1000000);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xBAA532, 0x3A2500, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setStyleSeparateurVerticaux(false, 0xBAA532);

super.setStyleSeparateurHorizontaux(0, 0xBAA532);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(2, 0xBAA532, 0x3A2500, 0xFAFAFA, 2.000000, 2.000000, 1, 1));

super.setDessinerLigneVide(true);

super.setCouleursLigne(0x848282, 0xFFFFFF, 0x848282, 0xF1000000);

super.setStyleSelectionMode9Images(0xBAA532, "C:\\Users\\Ranim\\Desktop\\Santé - CS\\Gabarits\\WM\\180 Poulco\\Poulco_Select.jpg?E5_3NP_4_4_4_4", new int[] {1,2,1,2,2,2,1,2,1}, new int[] {4, 4, 4, 4}, 5, creerPolice_GEN("Trebuchet MS", -8.000000, 0));

super.setStyleEnteteColonne(28, 1, WDCadreFactory.creerCadre_GEN("C:\\Users\\Ranim\\Desktop\\Santé - CS\\Gabarits\\WM\\180 Poulco\\Poulco_Table_ColTitle.png?E5_3NP_4_4_4_4", new int[] {1,2,1,2,2,2,1,2,1}, new int[] {4, 4, 4, 4}, WDDegradeFactory.creerDegrade_GEN(new int[]{0x435BF4, 0x4933EB}, 90, null), 1, 5), creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0xFFFFFF, true, "C:\\Users\\Ranim\\Desktop\\Santé - CS\\Gabarits\\WM\\180 Poulco\\Poulco_Table_ColPict.png");

super.setCadreFondLigne(WDCadreFactory.creerCadre_GEN("", new int[] {1,2,1,2,2,2,1,2,1}, new int[] {4, 4, 4, 4}, 0xFFFFFFFF, 0, 5));

super.setPoliceColonne(creerPolice_GEN("Trebuchet MS", -8.000000, 0));

super.setScrollRapideTable(false, null);

super.setBtnEnrouleDeroule(true);

super.setSwipe(0);

super.setNbMaxLignes(0);

super.setImagePlusMoins("");

super.setMargeInterneEnteteColonne(0, 0, 0, 0);

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
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
 * Traitement: Clic sur BTN_Delete
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// bTrouve est un booléen = Faux

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_bTrouve = new WDBooleen();



// bTrouve est un booléen = Faux

vWD_bTrouve.setValeur(false);


// 	HLitPremier(Traitement)
WDAPIHF.hLitPremier(WDAPIHF.getFichierSansCasseNiAccent("traitement"));

// 	TANTQUE PAS HEnDehors(Traitement) ET bTrouve = Faux
while(((!WDAPIHF.hEnDehors(WDAPIHF.getFichierSansCasseNiAccent("traitement")).getBoolean()) & vWD_bTrouve.opEgal(false)))
{
// 	SI Traitement.Login_pt = LIB_Pseudo ET Traitement.Nom_med = TABLE_Traitement.COL_Nom_med ET Traitement.Heure = TABLE_Traitement.COL_Heure ALORS
if(((WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("login_pt").opEgal(mWD_LIB_Pseudo) & WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("nom_med").opEgal(mWD_TABLE_Traitement.mWD_COL_Nom_med)) & WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("heure").opEgal(mWD_TABLE_Traitement.mWD_COL_Heure)))
{
// 			SELON Dialogue("Supprimer oui/non ?")
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
// 			SELON Dialogue("Supprimer oui/non ?")
WDObjet _WDExpSelon0 = WDAPIDialogue.dialogue(0);
if(_WDExpSelon0.opEgal(1))
{
// 					HSupprime(Traitement)	
WDAPIHF.hSupprime(WDAPIHF.getFichierSansCasseNiAccent("traitement"));

// 					COMBO_Famille					= ""
mWD_COMBO_Famille.setValeur("");

// 					COMBO_REQ_medicament_famille	= ""
mWD_COMBO_REQ_medicament_famille.setValeur("");

// 					SAI_Heure						= ""
mWD_SAI_Heure.setValeur("");

// 					SAI_Nb_Comprimé					= ""
mWD_SAI_Nb_Comprime.setValeur("");

// 					Info("Traitement supprimé")
WDAPIDialogue.info("Traitement supprimé");

// 					TableAffiche(TABLE_Traitement)
WDAPITable.tableAffiche(mWD_TABLE_Traitement);

}

}

// 			bTrouve = Vrai
vWD_bTrouve.setValeur(true);

}

// 	HLitSuivant(Traitement)	
WDAPIHF.hLitSuivant(WDAPIHF.getFichierSansCasseNiAccent("traitement"));

}

// 	SI bTrouve = Faux ALORS
if(vWD_bTrouve.opEgal(false))
{
// 		Info("Ce traitement n'existe pas")
WDAPIDialogue.info("Ce traitement n'existe pas");

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

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

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
 * Traitement: Clic sur BTN_Valider_la_prise
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// bTrouve est un booléen = Faux

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_bTrouve = new WDBooleen();



// bTrouve est un booléen = Faux

vWD_bTrouve.setValeur(false);


// 	HLitPremier(Traitement)
WDAPIHF.hLitPremier(WDAPIHF.getFichierSansCasseNiAccent("traitement"));

// 	tantque pas HEnDehors(Traitement) et bTrouve = Faux
while(((!WDAPIHF.hEnDehors(WDAPIHF.getFichierSansCasseNiAccent("traitement")).getBoolean()) & vWD_bTrouve.opEgal(false)))
{
// 	si Traitement.Login_pt = LIB_Pseudo et Traitement.Nom_med = TABLE_Traitement.COL_Nom_med et Traitement.Heure = TABLE_Traitement.COL_Heure ALORS
if(((WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("login_pt").opEgal(mWD_LIB_Pseudo) & WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("nom_med").opEgal(mWD_TABLE_Traitement.mWD_COL_Nom_med)) & WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("heure").opEgal(mWD_TABLE_Traitement.mWD_COL_Heure)))
{
// 	bTrouve = Vrai
vWD_bTrouve.setValeur(true);

}

// 	HLitSuivant(Traitement)	
WDAPIHF.hLitSuivant(WDAPIHF.getFichierSansCasseNiAccent("traitement"));

}

// 	si bTrouve = Faux ALORS
if(vWD_bTrouve.opEgal(false))
{
// 		info("Ce traitement n'existe pas")
WDAPIDialogue.info("Ce traitement n'existe pas");

}
else
{
// 	Prises_medicaments.date_prise_medicament = DateDuJour()
WDAPIHF.getFichierSansCasseNiAccent("prises_medicaments").getRubriqueSansCasseNiAccent("date_prise_medicament").setValeur(WDAPIDate.dateDuJour());

// 	Prises_medicaments.heure_prise_medicament = HeureSys()
WDAPIHF.getFichierSansCasseNiAccent("prises_medicaments").getRubriqueSansCasseNiAccent("heure_prise_medicament").setValeur(WDAPIDate.heureSys());

// 	Prises_medicaments.Login_pt = LIB_Pseudo
WDAPIHF.getFichierSansCasseNiAccent("prises_medicaments").getRubriqueSansCasseNiAccent("login_pt").setValeur(mWD_LIB_Pseudo);

// 	Prises_medicaments.Nom_med = TABLE_Traitement.COL_Nom_med
WDAPIHF.getFichierSansCasseNiAccent("prises_medicaments").getRubriqueSansCasseNiAccent("nom_med").setValeur(mWD_TABLE_Traitement.mWD_COL_Nom_med);

// 	Prises_medicaments.Heure = TABLE_Traitement.COL_Heure
WDAPIHF.getFichierSansCasseNiAccent("prises_medicaments").getRubriqueSansCasseNiAccent("heure").setValeur(mWD_TABLE_Traitement.mWD_COL_Heure);

// 	HAjoute(Prises_medicaments)
WDAPIHF.hAjoute(WDAPIHF.getFichierSansCasseNiAccent("prises_medicaments"));

// 	COMBO_Famille = ""
mWD_COMBO_Famille.setValeur("");

// 	COMBO_REQ_medicament_famille = ""
mWD_COMBO_REQ_medicament_famille.setValeur("");

// 	SAI_Heure = ""
mWD_SAI_Heure.setValeur("");

// 	SAI_Nb_Comprimé = ""
mWD_SAI_Nb_Comprime.setValeur("");

// 	Info("Prise enregistrée avec succès")
WDAPIDialogue.info("Prise enregistrée avec succès");

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

super.setPositionInitiale(276, 3);

super.setTailleInitiale(36, 27);

super.setValeurInitiale("C:\\Users\\Ranim\\Desktop\\Santé - CS\\IMG-Double-Ancrage.svg");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(10);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

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

super.setStyleLibelle(0x848282, creerPolice_GEN("Trebuchet MS", -8.000000, 0), -1, 0, 0x848282);

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
// OuvreFenêtreMobile(FEN_patient_param,LIB_Pseudo)
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

super.setPositionInitiale(1, -1);

super.setTailleInitiale(28, 32);

super.setValeurInitiale("C:\\Users\\Ranim\\Desktop\\Santé - CS\\personne.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(11);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

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

super.setStyleLibelle(0x848282, creerPolice_GEN("Trebuchet MS", -8.000000, 0), -1, 0, 0x848282);

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
// OuvreFenêtreMobile(FEN_affectation_patient_parrain,LIB_Pseudo)
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
 * Traitement: Déclarations globales de FEN_patient
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
 * Traitement: Prise de focus de FEN_patient
 */
public void priseDeFocus()
{
super.priseDeFocus();

// 
// LIB_Pseudo = gsPseudo
mWD_LIB_Pseudo.setValeur(vWD_gsPseudo);

// HFiltreIdentique(Traitement,Login_pt,LIB_Pseudo)
WDAPIHF.hFiltreIdentique(WDAPIHF.getFichierSansCasseNiAccent("traitement"),WDAPIHF.getRubriqueSansCasseNiAccent("login_pt"),mWD_LIB_Pseudo);

// TableAffiche(TABLE_Traitement)
WDAPITable.tableAffiche(mWD_TABLE_Traitement);

// TimerSys(watchdog_patient,10s,1)
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

super.setCouleurFond(0xFFFFFF);

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
return GWDPSante.getInstance().mWD_FEN_patient;
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
