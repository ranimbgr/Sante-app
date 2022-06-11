/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_parrain
 * Date : 06/06/2022 00:20:21
 * Version de wdjava.dll  : 25.0.221.6
 */


package com.masociete.sante.wdgen;


import com.masociete.sante.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.ui.champs.combo.*;
import fr.pcsoft.wdjava.core.context.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.core.parcours.*;
import fr.pcsoft.wdjava.core.parcours.hf.*;
import fr.pcsoft.wdjava.ui.champs.table.*;
import fr.pcsoft.wdjava.ui.champs.table.colonne.*;
import fr.pcsoft.wdjava.ui.champs.image.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_parrain extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_parrain
////////////////////////////////////////////////////////////////////////////

/**
 * LIB_Pseudo
 */
class GWDLIB_Pseudo extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_parrain.LIB_Pseudo
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2494196656822559249l);

super.setChecksum("612192782");

super.setNom("LIB_Pseudo");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Pseudo");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(22, 9);

super.setTailleInitiale(266, 19);

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
 * COMBO_REQ_parrain_patient
 */
class GWDCOMBO_REQ_parrain_patient extends WDComboFichierAccesDirect
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_parrain.COMBO_REQ_parrain_patient
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,2,71,40);
super.setRectCompPrincipal(71,2,233,40);
super.setQuid(2494196656822624785l);

super.setChecksum("614279342");

super.setNom("COMBO_REQ_parrain_patient");

super.setType(10002);

super.setBulle("");

super.setLibelle("Patient");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(8, 63);

super.setTailleInitiale(304, 44);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setSourceRemplissage("req_patient_par_parrain", "login_pt", "login_pt", "login_pt", true, "");

super.setContenuInitial("");

super.setTriee(false);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(8, 1000, 1000, 500, 1000, 0);

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
 * Traitement: Initialisation de COMBO_REQ_parrain_patient
 */
public void init()
//  Le champ utilise une requête paramétrée pour afficher ses données.
//  Les paramètres de cette requête doivent être définis avant ou lors de l'initialisation du champ.
//  La requête sera exécutée automatiquement si au moins un paramètre a été défini.
// 
//  Pour plus d'informations, veuillez consulter l'aide :
//  Requête paramétrée, Utilisation dans un champ Table, une Liste ou une Combo
// 
//  Paramètres de la requête 'REQ_parrain_patient'
{
super.init();

// // Le champ utilise une requête paramétrée pour afficher ses données.
// MaSource.ParamLogin_pr = ""
WDContexte.getMaSource().get("ParamLogin_pr").setValeur("");

}




/**
 * Traitement: Sélection d'une ligne de COMBO_REQ_parrain_patient
 */
public void selectionLigne()
{
super.selectionLigne();

// 

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_btrouve = new WDBooleen();

WDObjet vWD_x = new WDChaineU();



// TableSupprimeTout(TABLE_traitement)
WDAPITable.tableSupprimeTout(mWD_TABLE_traitement);

// HFiltreIdentique(Traitement,Login_pt,COMBO_REQ_parrain_patient)
WDAPIHF.hFiltreIdentique(WDAPIHF.getFichierSansCasseNiAccent("traitement"),WDAPIHF.getRubriqueSansCasseNiAccent("login_pt"),this);

// POUR CHAQUE Traitement 
IWDParcours parcours1 = null;
try
{
parcours1 = WDParcoursFichier.pourTout(WDAPIHF.getFichierSansCasseNiAccent("traitement"), null, true);
while(parcours1.testParcours())
{
// 	TableAjouteLigne(TABLE_traitement,Traitement.Nom_med,Traitement.Heure,Traitement.Nb_cmp)
WDAPITable.tableAjouteLigne(mWD_TABLE_traitement,new Object[] {WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("nom_med"),WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("heure"),WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("nb_cmp")} );

}
}
finally
{
if(parcours1 != null)
{
parcours1.finParcours();
}
}


// btrouve	est un booléen	= Faux

vWD_btrouve.setValeur(false);


// x		est une chaîne


// HFiltreIdentique(Traitement,Login_pt,COMBO_REQ_parrain_patient)
WDAPIHF.hFiltreIdentique(WDAPIHF.getFichierSansCasseNiAccent("traitement"),WDAPIHF.getRubriqueSansCasseNiAccent("login_pt"),this);

// POUR CHAQUE Traitement 
IWDParcours parcours2 = null;
try
{
parcours2 = WDParcoursFichier.pourTout(WDAPIHF.getFichierSansCasseNiAccent("traitement"), null, true);
while(parcours2.testParcours())
{
// 	POUR CHAQUE Prises_medicaments 
IWDParcours parcours3 = null;
try
{
parcours3 = WDParcoursFichier.pourTout(WDAPIHF.getFichierSansCasseNiAccent("prises_medicaments"), null, true);
while(parcours3.testParcours())
{
// 		SI Traitement.Login_pt = Prises_medicaments.Login_pt ET Traitement.Nom_med = Prises_medicaments.Nom_med ET Traitement.Heure = Prises_medicaments.Heure ALORS
if(((WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("login_pt").opEgal(WDAPIHF.getFichierSansCasseNiAccent("prises_medicaments").getRubriqueSansCasseNiAccent("login_pt")) & WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("nom_med").opEgal(WDAPIHF.getFichierSansCasseNiAccent("prises_medicaments").getRubriqueSansCasseNiAccent("nom_med"))) & WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("heure").opEgal(WDAPIHF.getFichierSansCasseNiAccent("prises_medicaments").getRubriqueSansCasseNiAccent("heure"))))
{
// 			SI Prises_medicaments.date_prise_medicament = DateDuJour() ALORS
if(WDAPIHF.getFichierSansCasseNiAccent("prises_medicaments").getRubriqueSansCasseNiAccent("date_prise_medicament").opEgal(WDAPIDate.dateDuJour()))
{
// 				btrouve = Vrai
vWD_btrouve.setValeur(true);

}

}

}
}
finally
{
if(parcours3 != null)
{
parcours3.finParcours();
}
}


// 	SI btrouve = Faux ET Traitement.Heure <= HeureSys() ALORS
if((vWD_btrouve.opEgal(false) & WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("heure").opInfEgal(WDAPIDate.heureSys())))
{
// 		x	= Traitement.Heure
vWD_x.setValeur(WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("heure"));

// 		x	= Milieu(x,1,2) + ":" + Milieu(x,3,2)
vWD_x.setValeur(WDAPIChaine.milieu(vWD_x,1,2).opPlus(":").opPlus(WDAPIChaine.milieu(vWD_x,3,2)));

// 		POUR i = 1 a TABLE_traitement..Occurrence
// 		POUR i = 1 a TABLE_traitement..Occurrence
for(WDObjet vWD_i = new WDEntier4(1);vWD_i.opInfEgal(mWD_TABLE_traitement.getProp(EWDPropriete.PROP_OCCURRENCE));vWD_i.opInc())
{
// 			TableSelectPlus(TABLE_traitement,i)
WDAPITable.tableSelectPlus(mWD_TABLE_traitement,new int[] {vWD_i.getInt()} );

// 			SI TABLE_traitement.COL_Médicament = Traitement.Nom_med ALORS
if(mWD_TABLE_traitement.mWD_COL_Medicament.opEgal(WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("nom_med")))
{
// 				TABLE_traitement[i].Couleur		= RougeFoncé
mWD_TABLE_traitement.get(vWD_i).setProp(EWDPropriete.PROP_COULEUR,128);

// 				TABLE_traitement[i].CouleurFond	= OrangeClair
mWD_TABLE_traitement.get(vWD_i).setProp(EWDPropriete.PROP_COULEURFOND,42495);

}

}

}
else
{
// 		btrouve = Faux
vWD_btrouve.setValeur(false);

}

}
}
finally
{
if(parcours2 != null)
{
parcours2.finParcours();
}
}


// FinTimerSys(2) 
WDAPITimer.finTimerSys(2);

// SI HNbEnr(patient_local) =0  ALORS
if(WDAPIHF.hNbEnr(WDAPIHF.getFichierSansCasseNiAccent("patient_local")).opEgal(0))
{
// 	patient_local.login = COMBO_REQ_parrain_patient..ValeurAffichée
WDAPIHF.getFichierSansCasseNiAccent("patient_local").getRubriqueSansCasseNiAccent("login").setValeur(this.getProp(EWDPropriete.PROP_VALEURAFFICHEE));

// 	HAjoute(patient_local)
WDAPIHF.hAjoute(WDAPIHF.getFichierSansCasseNiAccent("patient_local"));

}
else
{
// 	HLitPremier(patient_local)
WDAPIHF.hLitPremier(WDAPIHF.getFichierSansCasseNiAccent("patient_local"));

// 	patient_local.login = COMBO_REQ_parrain_patient..ValeurAffichée
WDAPIHF.getFichierSansCasseNiAccent("patient_local").getRubriqueSansCasseNiAccent("login").setValeur(this.getProp(EWDPropriete.PROP_VALEURAFFICHEE));

// 	HModifie(patient_local)
WDAPIHF.hModifie(WDAPIHF.getFichierSansCasseNiAccent("patient_local"));

}

// TimerSys(watchdog_parrain,10s,2) 
WDAPITimer.timerSys((new WDChaineU("COL_ProcéduresGlobales.watchdog_parrain")),(new WDDuree("0000010000")),(long)2);

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
public GWDCOMBO_REQ_parrain_patient mWD_COMBO_REQ_parrain_patient;

/**
 * TABLE_traitement
 */
class GWDTABLE_traitement extends WDTable
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_parrain.TABLE_traitement
////////////////////////////////////////////////////////////////////////////

/**
 * COL_Médicament
 */
class GWDCOL_Medicament extends WDColonneTexteSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_parrain.TABLE_traitement.COL_Médicament
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2494196656822755857l);

super.setNom("COL_Médicament");

super.setType(20001);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setLargeurInitiale(114);

super.setTitre("Médicament");

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
super.setCadrageHorizontal(0);

super.setCadrageVertical(1);

super.setMotDePasse(false);

super.setTaille(0);

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
public GWDCOL_Medicament mWD_COL_Medicament = new GWDCOL_Medicament();

/**
 * COL_Heure
 */
class GWDCOL_Heure extends WDColonneTexteSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_parrain.TABLE_traitement.COL_Heure
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2494196656822821393l);

super.setNom("COL_Heure");

super.setType(20003);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setLargeurInitiale(74);

super.setTitre("Heure");

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
super.setCadrageHorizontal(2);

super.setCadrageVertical(1);

super.setMotDePasse(false);

super.setTaille(0);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setTypeSaisie(3);

super.setFormatMemorise("HHMMSS");

super.setMasqueSaisie(new WDChaineU("UseSystemMask"));

super.setEllipse(0);

super.setMasqueAffichage(new WDChaineU(""));

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
// Déclaration des champs du fils n°3 de FEN_parrain.TABLE_traitement.COL_Nb_cmp
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2494196656822886929l);

super.setNom("COL_Nb_cmp");

super.setType(20004);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setLargeurInitiale(116);

super.setTitre("Nb cmp");

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
super.setCadrageHorizontal(2);

super.setCadrageVertical(1);

super.setMotDePasse(false);

super.setTaille(0);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setTypeSaisie(1);

super.setMasqueSaisie(new WDChaineU("MoneySystemMask"));

super.setEllipse(0);

super.setMasqueAffichage(new WDChaineU(""));

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(false);

}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCOL_Nb_cmp mWD_COL_Nb_cmp = new GWDCOL_Nb_cmp();
/**
 * Initialise tous les champs de FEN_parrain.TABLE_traitement
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_parrain.TABLE_traitement
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
super.ajouterColonne("COL_Médicament",mWD_COL_Medicament);
super.ajouterColonne("COL_Heure",mWD_COL_Heure);
super.ajouterColonne("COL_Nb_cmp",mWD_COL_Nb_cmp);
mWD_COL_Medicament.initialiserObjet();
mWD_COL_Heure.initialiserObjet();
mWD_COL_Nb_cmp.initialiserObjet();

}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2494196656822690321l);

super.setChecksum("612326590");

super.setNom("TABLE_traitement");

super.setType(9);

super.setBulle("");

super.setLibelle("Table");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(1);

super.setPositionInitiale(5, 115);

super.setTailleInitiale(313, 254);

super.setValeurInitiale("");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setTailleCellule(43, 3, 3, 3, 3, 0);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setNumTab(2);

super.setModeAscenseur(1, 1);

super.setModeSelection(99);

super.setSaisieEnCascade(false);

super.setLettreAppel(65535);

super.setNumColonneAncree(1);

super.setEnregistrementSortieLigne(true);

super.setPersistant(true);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x848282, creerPolice_GEN("Trebuchet MS", -8.000000, 0), -1, 0, 0x848282);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xBAA532, 0x3A2500, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setStyleSeparateurVerticaux(false, 0xBAA532);

super.setStyleSeparateurHorizontaux(0, 0xBAA532);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(2, 0xBAA532, 0x3A2500, 0xFAFAFA, 2.000000, 2.000000, 1, 1));

super.setDessinerLigneVide(true);

super.setCouleursLigne(0x848282, 0xFFFFFF, 0x848282, 0xFFFFFF);

super.setStyleSelectionMode9Images(0xBAA532, "C:\\Users\\Ranim\\Desktop\\Santé - CS\\Gabarits\\WM\\180 Poulco\\Poulco_Select.jpg?E5_3NP_4_4_4_4", new int[] {1,2,1,2,2,2,1,2,1}, new int[] {4, 4, 4, 4}, 5, creerPolice_GEN("Trebuchet MS", -8.000000, 0));

super.setStyleEnteteColonne(28, 1, WDCadreFactory.creerCadre_GEN("C:\\Users\\Ranim\\Desktop\\Santé - CS\\Gabarits\\WM\\180 Poulco\\Poulco_Table_ColTitle.png?E5_3NP_4_4_4_4", new int[] {1,2,1,2,2,2,1,2,1}, new int[] {4, 4, 4, 4}, 0xFFFFFF, 1, 5), creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0xFFFFFF, true, "C:\\Users\\Ranim\\Desktop\\Santé - CS\\Gabarits\\WM\\180 Poulco\\Poulco_Table_ColPict.png");

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
public GWDTABLE_traitement mWD_TABLE_traitement;

/**
 * IMG_param
 */
class GWDIMG_param extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_parrain.IMG_param
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2494196656822952465l);

super.setChecksum("612588278");

super.setNom("IMG_param");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(285, 5);

super.setTailleInitiale(33, 33);

super.setValeurInitiale("C:\\Users\\Ranim\\Desktop\\Santé - CS\\IMG-Double-Ancrage.svg");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

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

// OuvreFenêtreMobile(FEN_parrain_param,LIB_Pseudo) 
// OuvreFenêtreMobile(FEN_parrain_param,LIB_Pseudo) 
WDAPIFenetre.ouvreFille(GWDPSante.getInstance().mWD_FEN_parrain_param,new WDObjet[] {mWD_LIB_Pseudo} );

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
 * BTN_Actualiser
 */
class GWDBTN_Actualiser extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FEN_parrain.BTN_Actualiser
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2494196656823018001l);

super.setChecksum("612651990");

super.setNom("BTN_Actualiser");

super.setType(4);

super.setBulle("");

super.setLibelle("Actualiser ");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(115, 417);

super.setTailleInitiale(94, 48);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(5, 0, 1000, 500, 1000, 0);

super.setNumTab(3);

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
 * Traitement: Clic sur BTN_Actualiser
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// TableSupprimeTout(TABLE_traitement)

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_btrouve = new WDBooleen();

WDObjet vWD_x = new WDChaineU();



// TableSupprimeTout(TABLE_traitement)
WDAPITable.tableSupprimeTout(mWD_TABLE_traitement);

// HFiltreIdentique(Traitement,Login_pt,COMBO_REQ_parrain_patient)
WDAPIHF.hFiltreIdentique(WDAPIHF.getFichierSansCasseNiAccent("traitement"),WDAPIHF.getRubriqueSansCasseNiAccent("login_pt"),mWD_COMBO_REQ_parrain_patient);

// POUR CHAQUE Traitement 
IWDParcours parcours4 = null;
try
{
parcours4 = WDParcoursFichier.pourTout(WDAPIHF.getFichierSansCasseNiAccent("traitement"), null, true);
while(parcours4.testParcours())
{
// 	TableAjouteLigne(TABLE_traitement,Traitement.Nom_med,Traitement.Heure,Traitement.Nb_cmp)
WDAPITable.tableAjouteLigne(mWD_TABLE_traitement,new Object[] {WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("nom_med"),WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("heure"),WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("nb_cmp")} );

}
}
finally
{
if(parcours4 != null)
{
parcours4.finParcours();
}
}


// btrouve	est un booléen	= Faux

vWD_btrouve.setValeur(false);


// x		est une chaîne


// HFiltreIdentique(Traitement,Login_pt,COMBO_REQ_parrain_patient)
WDAPIHF.hFiltreIdentique(WDAPIHF.getFichierSansCasseNiAccent("traitement"),WDAPIHF.getRubriqueSansCasseNiAccent("login_pt"),mWD_COMBO_REQ_parrain_patient);

// POUR CHAQUE Traitement 
IWDParcours parcours5 = null;
try
{
parcours5 = WDParcoursFichier.pourTout(WDAPIHF.getFichierSansCasseNiAccent("traitement"), null, true);
while(parcours5.testParcours())
{
// 	POUR CHAQUE Prises_medicaments 
IWDParcours parcours6 = null;
try
{
parcours6 = WDParcoursFichier.pourTout(WDAPIHF.getFichierSansCasseNiAccent("prises_medicaments"), null, true);
while(parcours6.testParcours())
{
// 		SI Traitement.Login_pt = Prises_medicaments.Login_pt ET Traitement.Nom_med = Prises_medicaments.Nom_med ET Traitement.Heure = Prises_medicaments.Heure ALORS
if(((WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("login_pt").opEgal(WDAPIHF.getFichierSansCasseNiAccent("prises_medicaments").getRubriqueSansCasseNiAccent("login_pt")) & WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("nom_med").opEgal(WDAPIHF.getFichierSansCasseNiAccent("prises_medicaments").getRubriqueSansCasseNiAccent("nom_med"))) & WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("heure").opEgal(WDAPIHF.getFichierSansCasseNiAccent("prises_medicaments").getRubriqueSansCasseNiAccent("heure"))))
{
// 			SI Prises_medicaments.date_prise_medicament = DateDuJour() ALORS
if(WDAPIHF.getFichierSansCasseNiAccent("prises_medicaments").getRubriqueSansCasseNiAccent("date_prise_medicament").opEgal(WDAPIDate.dateDuJour()))
{
// 				btrouve = Vrai
vWD_btrouve.setValeur(true);

}

}

}
}
finally
{
if(parcours6 != null)
{
parcours6.finParcours();
}
}


// 	SI btrouve = Faux ET Traitement.Heure <= HeureSys() ALORS
if((vWD_btrouve.opEgal(false) & WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("heure").opInfEgal(WDAPIDate.heureSys())))
{
// 		x	= Traitement.Heure
vWD_x.setValeur(WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("heure"));

// 		x	= Milieu(x,1,2) + ":" + Milieu(x,3,2)
vWD_x.setValeur(WDAPIChaine.milieu(vWD_x,1,2).opPlus(":").opPlus(WDAPIChaine.milieu(vWD_x,3,2)));

// 		POUR i = 1 a TABLE_traitement..Occurrence
// 		POUR i = 1 a TABLE_traitement..Occurrence
for(WDObjet vWD_i = new WDEntier4(1);vWD_i.opInfEgal(mWD_TABLE_traitement.getProp(EWDPropriete.PROP_OCCURRENCE));vWD_i.opInc())
{
// 			TableSelectPlus(TABLE_traitement,i)
WDAPITable.tableSelectPlus(mWD_TABLE_traitement,new int[] {vWD_i.getInt()} );

// 			SI TABLE_traitement.COL_Médicament = Traitement.Nom_med ALORS
if(mWD_TABLE_traitement.mWD_COL_Medicament.opEgal(WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("nom_med")))
{
// 				TABLE_traitement[i].Couleur		= RougeFoncé
mWD_TABLE_traitement.get(vWD_i).setProp(EWDPropriete.PROP_COULEUR,128);

// 				TABLE_traitement[i].CouleurFond	= OrangeClair
mWD_TABLE_traitement.get(vWD_i).setProp(EWDPropriete.PROP_COULEURFOND,42495);

}

}

}
else
{
// 		btrouve = Faux
vWD_btrouve.setValeur(false);

}

}
}
finally
{
if(parcours5 != null)
{
parcours5.finParcours();
}
}


// FinTimerSys(2) 
WDAPITimer.finTimerSys(2);

// SI HNbEnr(patient_local) =0  ALORS
if(WDAPIHF.hNbEnr(WDAPIHF.getFichierSansCasseNiAccent("patient_local")).opEgal(0))
{
// 	patient_local.login = COMBO_REQ_parrain_patient..ValeurAffichée
WDAPIHF.getFichierSansCasseNiAccent("patient_local").getRubriqueSansCasseNiAccent("login").setValeur(mWD_COMBO_REQ_parrain_patient.getProp(EWDPropriete.PROP_VALEURAFFICHEE));

// 	HAjoute(patient_local)
WDAPIHF.hAjoute(WDAPIHF.getFichierSansCasseNiAccent("patient_local"));

}
else
{
// 	HLitPremier(patient_local)
WDAPIHF.hLitPremier(WDAPIHF.getFichierSansCasseNiAccent("patient_local"));

// 	patient_local.login = COMBO_REQ_parrain_patient..ValeurAffichée
WDAPIHF.getFichierSansCasseNiAccent("patient_local").getRubriqueSansCasseNiAccent("login").setValeur(mWD_COMBO_REQ_parrain_patient.getProp(EWDPropriete.PROP_VALEURAFFICHEE));

// 	HModifie(patient_local)
WDAPIHF.hModifie(WDAPIHF.getFichierSansCasseNiAccent("patient_local"));

}

// TimerSys(watchdog_parrain,10s,2) 
WDAPITimer.timerSys((new WDChaineU("COL_ProcéduresGlobales.watchdog_parrain")),(new WDDuree("0000010000")),(long)2);

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
public GWDBTN_Actualiser mWD_BTN_Actualiser;

/**
 * ACTB_ActionBar
 */
class GWDACTB_ActionBar extends WDActionBar
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_parrain.ACTB_ActionBar
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
 * Traitement: Déclarations globales de FEN_parrain
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
 * Traitement: Prise de focus de FEN_parrain
 */
public void priseDeFocus()
{
super.priseDeFocus();

// 

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_btrouve = new WDBooleen();

WDObjet vWD_x = new WDChaineU();



// LIB_Pseudo = gsPseudo
mWD_LIB_Pseudo.setValeur(vWD_gsPseudo);

// REQ_patient_par_parrain.ParamLogin_pr = LIB_Pseudo
WDAPIHF.getFichierSansCasseNiAccent("req_patient_par_parrain").getRubriqueSansCasseNiAccent("paramlogin_pr").setValeur(mWD_LIB_Pseudo);

// HExécuteRequête(REQ_patient_par_parrain)
WDAPIHF.hExecuteRequete(WDAPIHF.getRequeteSansCasseNiAccent("req_patient_par_parrain"));

// ListeAffiche(COMBO_REQ_parrain_patient)
WDAPIListe.listeAffiche(mWD_COMBO_REQ_parrain_patient);

// HFiltreIdentique(Traitement,Login_pt,COMBO_REQ_parrain_patient)
WDAPIHF.hFiltreIdentique(WDAPIHF.getFichierSansCasseNiAccent("traitement"),WDAPIHF.getRubriqueSansCasseNiAccent("login_pt"),mWD_COMBO_REQ_parrain_patient);

// pour CHAQUE Traitement 
IWDParcours parcours7 = null;
try
{
parcours7 = WDParcoursFichier.pourTout(WDAPIHF.getFichierSansCasseNiAccent("traitement"), null, true);
while(parcours7.testParcours())
{
// 	TableAjouteLigne(TABLE_traitement,Traitement.Nom_med,Traitement.Heure,Traitement.Nb_cmp)
WDAPITable.tableAjouteLigne(mWD_TABLE_traitement,new Object[] {WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("nom_med"),WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("heure"),WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("nb_cmp")} );

}
}
finally
{
if(parcours7 != null)
{
parcours7.finParcours();
}
}


// btrouve	est un booléen	= Faux

vWD_btrouve.setValeur(false);


// x		est une chaîne


// HFiltreIdentique(Traitement,Login_pt,COMBO_REQ_parrain_patient)
WDAPIHF.hFiltreIdentique(WDAPIHF.getFichierSansCasseNiAccent("traitement"),WDAPIHF.getRubriqueSansCasseNiAccent("login_pt"),mWD_COMBO_REQ_parrain_patient);

// POUR CHAQUE Traitement 
IWDParcours parcours8 = null;
try
{
parcours8 = WDParcoursFichier.pourTout(WDAPIHF.getFichierSansCasseNiAccent("traitement"), null, true);
while(parcours8.testParcours())
{
// 	POUR CHAQUE Prises_medicaments 
IWDParcours parcours9 = null;
try
{
parcours9 = WDParcoursFichier.pourTout(WDAPIHF.getFichierSansCasseNiAccent("prises_medicaments"), null, true);
while(parcours9.testParcours())
{
// 		SI Traitement.Login_pt = Prises_medicaments.Login_pt ET Traitement.Nom_med = Prises_medicaments.Nom_med ET Traitement.Heure = Prises_medicaments.Heure ALORS
if(((WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("login_pt").opEgal(WDAPIHF.getFichierSansCasseNiAccent("prises_medicaments").getRubriqueSansCasseNiAccent("login_pt")) & WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("nom_med").opEgal(WDAPIHF.getFichierSansCasseNiAccent("prises_medicaments").getRubriqueSansCasseNiAccent("nom_med"))) & WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("heure").opEgal(WDAPIHF.getFichierSansCasseNiAccent("prises_medicaments").getRubriqueSansCasseNiAccent("heure"))))
{
// 			SI Prises_medicaments.date_prise_medicament = DateDuJour() ALORS
if(WDAPIHF.getFichierSansCasseNiAccent("prises_medicaments").getRubriqueSansCasseNiAccent("date_prise_medicament").opEgal(WDAPIDate.dateDuJour()))
{
// 				btrouve = Vrai
vWD_btrouve.setValeur(true);

}

}

}
}
finally
{
if(parcours9 != null)
{
parcours9.finParcours();
}
}


// 	SI btrouve = Faux ET Traitement.Heure <= HeureSys() ALORS
if((vWD_btrouve.opEgal(false) & WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("heure").opInfEgal(WDAPIDate.heureSys())))
{
// 		x	= Traitement.Heure
vWD_x.setValeur(WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("heure"));

// 		x	= Milieu(x,1,2) + ":" + Milieu(x,3,2)
vWD_x.setValeur(WDAPIChaine.milieu(vWD_x,1,2).opPlus(":").opPlus(WDAPIChaine.milieu(vWD_x,3,2)));

// 		POUR i = 1 a TABLE_traitement..Occurrence
// 		POUR i = 1 a TABLE_traitement..Occurrence
for(WDObjet vWD_i = new WDEntier4(1);vWD_i.opInfEgal(mWD_TABLE_traitement.getProp(EWDPropriete.PROP_OCCURRENCE));vWD_i.opInc())
{
// 			TableSelectPlus(TABLE_traitement,i)
WDAPITable.tableSelectPlus(mWD_TABLE_traitement,new int[] {vWD_i.getInt()} );

// 			SI TABLE_traitement.COL_Médicament = Traitement.Nom_med ALORS
if(mWD_TABLE_traitement.mWD_COL_Medicament.opEgal(WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("nom_med")))
{
// 				TABLE_traitement[i].Couleur		= RougeFoncé
mWD_TABLE_traitement.get(vWD_i).setProp(EWDPropriete.PROP_COULEUR,128);

// 				TABLE_traitement[i].CouleurFond	= OrangeClair	
mWD_TABLE_traitement.get(vWD_i).setProp(EWDPropriete.PROP_COULEURFOND,42495);

}

}

}
else
{
// 		btrouve = Faux
vWD_btrouve.setValeur(false);

}

}
}
finally
{
if(parcours8 != null)
{
parcours8.finParcours();
}
}


// SI HNbEnr(patient_local) =0  ALORS
if(WDAPIHF.hNbEnr(WDAPIHF.getFichierSansCasseNiAccent("patient_local")).opEgal(0))
{
//      patient_local.login = COMBO_REQ_parrain_patient..ValeurAffichée
WDAPIHF.getFichierSansCasseNiAccent("patient_local").getRubriqueSansCasseNiAccent("login").setValeur(mWD_COMBO_REQ_parrain_patient.getProp(EWDPropriete.PROP_VALEURAFFICHEE));

//      HAjoute(patient_local)
WDAPIHF.hAjoute(WDAPIHF.getFichierSansCasseNiAccent("patient_local"));

}
else
{
// 	 HLitPremier(patient_local)
WDAPIHF.hLitPremier(WDAPIHF.getFichierSansCasseNiAccent("patient_local"));

// 	 patient_local.login = COMBO_REQ_parrain_patient..ValeurAffichée
WDAPIHF.getFichierSansCasseNiAccent("patient_local").getRubriqueSansCasseNiAccent("login").setValeur(mWD_COMBO_REQ_parrain_patient.getProp(EWDPropriete.PROP_VALEURAFFICHEE));

// 	 HModifie(patient_local)
WDAPIHF.hModifie(WDAPIHF.getFichierSansCasseNiAccent("patient_local"));

}

// TimerSys(watchdog_parrain,10s,2)
WDAPITimer.timerSys((new WDChaineU("COL_ProcéduresGlobales.watchdog_parrain")),(new WDDuree("0000010000")),(long)2);

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
// Création des champs de la fenêtre FEN_parrain
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_LIB_Pseudo = new GWDLIB_Pseudo();
mWD_COMBO_REQ_parrain_patient = new GWDCOMBO_REQ_parrain_patient();
mWD_TABLE_traitement = new GWDTABLE_traitement();
mWD_IMG_param = new GWDIMG_param();
mWD_BTN_Actualiser = new GWDBTN_Actualiser();
mWD_ACTB_ActionBar = new GWDACTB_ActionBar();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_parrain
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2494196656822493713l);

super.setChecksum("617395887");

super.setNom("FEN_parrain");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 495);

super.setTitre("Parrain");

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
// Initialisation des champs de FEN_parrain
////////////////////////////////////////////////////////////////////////////
mWD_LIB_Pseudo.initialiserObjet();
super.ajouter("LIB_Pseudo", mWD_LIB_Pseudo);
mWD_COMBO_REQ_parrain_patient.initialiserObjet();
super.ajouter("COMBO_REQ_parrain_patient", mWD_COMBO_REQ_parrain_patient);
mWD_TABLE_traitement.initialiserObjet();
super.ajouter("TABLE_traitement", mWD_TABLE_traitement);
mWD_IMG_param.initialiserObjet();
super.ajouter("IMG_param", mWD_IMG_param);
mWD_BTN_Actualiser.initialiserObjet();
super.ajouter("BTN_Actualiser", mWD_BTN_Actualiser);
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
return GWDPSante.getInstance().mWD_FEN_parrain;
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
