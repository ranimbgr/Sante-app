/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Projet
 * Classe Android : Santé
 * Date : 30/05/2022 10:25:12
 * Version de wdjava.dll  : 25.0.221.6
 */


package com.masociete.sante.wdgen;


import com.masociete.sante.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.api.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/





public class GWDPSante extends WDProjet
{
private static GWDPSante ms_instance = null;
/**
 * Accès au projet: Santé
 * Pour accéder au projet à partir de n'importe où: 
 * GWDPSante.getInstance()
 */
public static GWDPSante getInstance()
{
return (GWDPSante) ms_instance;
}

 // FEN_Accueil
public GWDFFEN_Accueil mWD_FEN_Accueil = new GWDFFEN_Accueil();
 // accesseur de FEN_Accueil
public GWDFFEN_Accueil getFEN_Accueil()
{
mWD_FEN_Accueil.checkOuverture();
return mWD_FEN_Accueil;
}

 // FEN_Inscription_Adhérant
public GWDFFEN_Inscription_Adherant mWD_FEN_Inscription_Adherant = new GWDFFEN_Inscription_Adherant();
 // accesseur de FEN_Inscription_Adhérant
public GWDFFEN_Inscription_Adherant getFEN_Inscription_Adherant()
{
mWD_FEN_Inscription_Adherant.checkOuverture();
return mWD_FEN_Inscription_Adherant;
}

 // FEN_patient
public GWDFFEN_patient mWD_FEN_patient = new GWDFFEN_patient();
 // accesseur de FEN_patient
public GWDFFEN_patient getFEN_patient()
{
mWD_FEN_patient.checkOuverture();
return mWD_FEN_patient;
}

 // FEN_Connexion
public GWDFFEN_Connexion mWD_FEN_Connexion = new GWDFFEN_Connexion();
 // accesseur de FEN_Connexion
public GWDFFEN_Connexion getFEN_Connexion()
{
mWD_FEN_Connexion.checkOuverture();
return mWD_FEN_Connexion;
}

 // FEN_affectation_patient_parrain
public GWDFFEN_affectation_patient_parrain mWD_FEN_affectation_patient_parrain = new GWDFFEN_affectation_patient_parrain();
 // accesseur de FEN_affectation_patient_parrain
public GWDFFEN_affectation_patient_parrain getFEN_affectation_patient_parrain()
{
mWD_FEN_affectation_patient_parrain.checkOuverture();
return mWD_FEN_affectation_patient_parrain;
}

 // FEN_parrain_v2
public GWDFFEN_parrain_v2 mWD_FEN_parrain_v2 = new GWDFFEN_parrain_v2();
 // accesseur de FEN_parrain_v2
public GWDFFEN_parrain_v2 getFEN_parrain_v2()
{
mWD_FEN_parrain_v2.checkOuverture();
return mWD_FEN_parrain_v2;
}

 // FEN_patient_param
public GWDFFEN_patient_param mWD_FEN_patient_param = new GWDFFEN_patient_param();
 // accesseur de FEN_patient_param
public GWDFFEN_patient_param getFEN_patient_param()
{
mWD_FEN_patient_param.checkOuverture();
return mWD_FEN_patient_param;
}

 // FEN_parrain_v2_param
public GWDFFEN_parrain_v2_param mWD_FEN_parrain_v2_param = new GWDFFEN_parrain_v2_param();
 // accesseur de FEN_parrain_v2_param
public GWDFFEN_parrain_v2_param getFEN_parrain_v2_param()
{
mWD_FEN_parrain_v2_param.checkOuverture();
return mWD_FEN_parrain_v2_param;
}


 // Constructeur de la classe GWDPSante
public GWDPSante()
{
ms_instance = this;
// Définition des langues du projet
setLangueProjet(new int[] {1}, new int[] {0}, 1, false);
ajouterCollectionProcedures(GWDCPCOL_ProceduresGlobales.getInstance());

// Palette des couleurs
setPaletteCouleurGabarit(new int[] {0xF48542, 0x313FD2, 0xA6F2, 0x4F900D, 0xA95CF8, 0xB86592, 0xB74A5E, 0xA5A595, 0x654E44, 0x383838, 0x0});
ajouterFenetre("FEN_Accueil", mWD_FEN_Accueil);
ajouterFenetre("FEN_Inscription_Adhérant", mWD_FEN_Inscription_Adherant);
ajouterFenetre("FEN_patient", mWD_FEN_patient);
ajouterFenetre("FEN_Connexion", mWD_FEN_Connexion);
ajouterFenetre("FEN_affectation_patient_parrain", mWD_FEN_affectation_patient_parrain);
ajouterFenetre("FEN_parrain_v2", mWD_FEN_parrain_v2);
ajouterFenetre("FEN_patient_param", mWD_FEN_patient_param);
ajouterFenetre("FEN_parrain_v2_param", mWD_FEN_parrain_v2_param);

ajouterRequeteWDR( new GWDRREQ_medicament_par_famille() );
ajouterRequeteWDR( new GWDRREQ_patient_par_parrain() );
ajouterRequeteWDR( new GWDRREQ_trouve_parrainage() );
ajouterRequeteWDR( new GWDRREQ_patient_parrain_update_loginpatient() );
ajouterRequeteWDR( new GWDRREQ_prise_update_loginpatient() );
ajouterRequeteWDR( new GWDRREQ_traitement_update_loginpatient() );
ajouterRequeteWDR( new GWDRREQ_patient_parrain_update_loginparrain() );


}


////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
public String getVersionApplication(){ return "0.0.3.0";}
public String getNomSociete(){ return "";}
public String getNomAPK(){ return "Sante";}
public int getIdNomApplication(){return com.masociete.sante.R.string.app_name;}
public boolean isModeAnsi(){ return false;}
public boolean isAffectationTableauParCopie(){ return true;}
public boolean isAssistanceAutoHFActive(){ return true;}
public String getPackageRacine(){ return "com.masociete.sante";}
public int getIdIconeApplication(){ return com.masociete.sante.R.drawable.i_c_o_n_e________2;}
public int getInfoPlateforme(EWDInfoPlateforme info)
{
switch(info)
{
case DPI_ECRAN : return 160;
case HAUTEUR_BARRE_SYSTEME : return 25;
case HAUTEUR_BARRE_TITRE : return 25;
case HAUTEUR_ACTION_BAR : return 48;
case HAUTEUR_BARRE_BAS : return 0;
case HAUTEUR_ECRAN : return 568;
case LARGEUR_ECRAN : return 320;
default : return 0;
}
}
public boolean isActiveThemeMaterialDesign()
{
return true;
}
////////////////////////////////////////////////////////////////////////////
public String getAdresseEmail() 
{
return "";
}
public boolean isIgnoreErreurCertificatHTTPS()
{
return false;
}
////////////////////////////////////////////////////////////////////////////
public boolean isUniteAffichageLogique()
{
return false;
}
public String getNomProjet()
{
return "Santé";
}
public String getNomConfiguration()
{
return "Application Android";
}
public String getNomAnalyse()
{
return "sante";
}
public String getMotDePasseAnalyse()
{
return "";
}
public boolean isModeGestionFichierMultiUtilisateur()
{
return true;
}
public boolean isCreationAutoFichierDonnees()
{
return true;
}

////////////////////////////////////////////////////////////////////////////
// Formats des masques du projet
////////////////////////////////////////////////////////////////////////////
public String getFichierWDM()
{
return null;
}
protected void declarerRessources()
{
super.ajouterFichierAssocie("patient.fic",com.masociete.sante.R.raw.patient_3, "##BDD##/patient.fic");
super.ajouterFichierAssocie("patient.ndx",com.masociete.sante.R.raw.patient_4, "##BDD##/patient.ndx");
super.ajouterFichierAssocie("Prises_medicaments.ndx",com.masociete.sante.R.raw.prises_medicaments_5, "##BDD##/prises_medicaments.ndx");
super.ajouterFichierAssocie("patient_local.fic",com.masociete.sante.R.raw.patient_local_6, "##BDD##/patient_local.fic");
super.ajouterFichierAssocie("Traitement.ndx",com.masociete.sante.R.raw.traitement_7, "##BDD##/traitement.ndx");
super.ajouterFichierAssocie("famille.ndx",com.masociete.sante.R.raw.famille_8, "##BDD##/famille.ndx");
super.ajouterFichierAssocie("famille.fic",com.masociete.sante.R.raw.famille_9, "##BDD##/famille.fic");
super.ajouterFichierAssocie("medicament.ndx",com.masociete.sante.R.raw.medicament_10, "##BDD##/medicament.ndx");
super.ajouterFichierAssocie("patient_local.ndx",com.masociete.sante.R.raw.patient_local_11, "##BDD##/patient_local.ndx");
super.ajouterFichierAssocie("Traitement.fic",com.masociete.sante.R.raw.traitement_12, "##BDD##/traitement.fic");
super.ajouterFichierAssocie("patient_parrain.fic",com.masociete.sante.R.raw.patient_parrain_13, "##BDD##/patient_parrain.fic");
super.ajouterFichierAssocie("parrain.fic",com.masociete.sante.R.raw.parrain_14, "##BDD##/parrain.fic");
super.ajouterFichierAssocie("patient_parrain.ndx",com.masociete.sante.R.raw.patient_parrain_15, "##BDD##/patient_parrain.ndx");
super.ajouterFichierAssocie("medicament.fic",com.masociete.sante.R.raw.medicament_16, "##BDD##/medicament.fic");
super.ajouterFichierAssocie("Prises_medicaments.fic",com.masociete.sante.R.raw.prises_medicaments_17, "##BDD##/prises_medicaments.fic");
super.ajouterFichierAssocie("parrain.ndx",com.masociete.sante.R.raw.parrain_18, "##BDD##/parrain.ndx");
super.ajouterFichierAssocie("F:\\SANTÉ\\GABARITS\\WM\\250 PHOENIX\\PHOENIX_BTN_MENU.PNG?E5_3NP_10_10_10_10",com.masociete.sante.R.drawable.phoenix_btn_menu_19_np3_10_10_10_10_selector, "");
super.ajouterFichierAssocie("F:\\SANTÉ\\PHOENIX_BTN_MENU.PNG?E5_3NP_10_10_10_10",com.masociete.sante.R.drawable.phoenix_btn_menu_20_np3_10_10_10_10_selector, "");
super.ajouterFichierAssocie("F:\\SANTÉ\\PHOENIX_COMBO.PNG?E5_3NP_30_8_26_8",com.masociete.sante.R.drawable.phoenix_combo_21_np3_30_8_26_8_selector, "");
super.ajouterFichierAssocie("F:\\SANTÉ\\PHOENIX_EDT.PNG?E5_3NP_8_8_8_8",com.masociete.sante.R.drawable.phoenix_edt_22_np3_8_8_8_8_selector, "");
super.ajouterFichierAssocie("F:\\SANTÉ\\GABARITS\\WM\\250 PHOENIX\\PHOENIX_CBOX.PNG?E12_8O",com.masociete.sante.R.drawable.phoenix_cbox_23_selector, "");
super.ajouterFichierAssocie("F:\\SANTÉ\\GABARITS\\WM\\250 PHOENIX\\PHOENIX_EDT.PNG?E5_3NP_8_8_8_8",com.masociete.sante.R.drawable.phoenix_edt_24_np3_8_8_8_8_selector, "");
super.ajouterFichierAssocie("F:\\SANTÉ\\PLUS.PNG",com.masociete.sante.R.drawable.plus_25, "");
super.ajouterFichierAssocie("F:\\SANTÉ\\GABARITS\\WM\\250 PHOENIX\\PHOENIX_BREAK_PICT.PNG?E2_4O",com.masociete.sante.R.drawable.phoenix_break_pict_26_selector, "");
super.ajouterFichierAssocie("F:\\SANTÉ\\GABARITS\\WM\\250 PHOENIX\\PHOENIX_CBOX_TABLE.PNG",com.masociete.sante.R.drawable.phoenix_cbox_table_27, "");
super.ajouterFichierAssocie("F:\\SANTÉ\\GABARITS\\WM\\250 PHOENIX\\PHOENIX_COMBO.PNG?E5_3NP_30_8_26_8",com.masociete.sante.R.drawable.phoenix_combo_28_np3_30_8_26_8_selector, "");
super.ajouterFichierAssocie("F:\\SANTÉ\\GABARITS\\WM\\250 PHOENIX\\PHOENIX_TABLE_COLPICT.PNG",com.masociete.sante.R.drawable.phoenix_table_colpict_29, "");
super.ajouterFichierAssocie("F:\\SANTÉ\\IMG-DOUBLE-ANCRAGE.SVG",com.masociete.sante.R.raw.img_double_ancrage_30, "");
super.ajouterFichierAssocie("F:\\SANTÉ\\GABARITS\\WM\\210 MATERIAL DESIGN RED\\MATERIAL DESIGN RED_BTN_STD.PNG?E5_3NP_10_10_10_10",com.masociete.sante.R.drawable.material_design_red_btn_std_31_np3_10_10_10_10_selector, "");
super.ajouterFichierAssocie("F:\\SANTÉ\\PERSONNE.PNG",com.masociete.sante.R.drawable.personne_32, "");
}

////////////////////////////////////////////////////////////////////////////
// Dialogues avec Question
////////////////////////////////////////////////////////////////////////////
public WDObjet afficherDialogue(int nIdQuestion, String... params)
{
switch(nIdQuestion)
{
case 0 : return WDAPIDialogue.dialogue("Supprimer o/n ?", new String[] {"&Supprimer", "&Ne pas supprimer"} , new int[] {1, 2} , 0, 1, 1, "", 1, com.masociete.sante.R.raw.question_1324003937640029402_1_33, params);

default: return super.afficherDialogue(nIdQuestion, params);
}
}

////////////////////////////////////////////////////////////////////////////
// Saisies avec Question
////////////////////////////////////////////////////////////////////////////
public WDObjet afficherSaisie(int nIdQuestion, WDObjet variable, String... params)
{
switch(nIdQuestion)
{
case 0 : return WDAPIDialogue.saisie("Supprimer o/n ?", new String[] {"&Supprimer", "&Ne pas supprimer"} , new int[] {1, 2} , 0, 1, 1, "", 1, com.masociete.sante.R.raw.question_1324003937640029402_1_33, variable, params);

default: return super.afficherSaisie(nIdQuestion, variable, params);
}
}
// Initialisation des collections de procédures
public void initCollections()
{
GWDCPCOL_ProceduresGlobales.init();

}


// Terminaison des collections de procédures
public void terminaisonCollections()
{
GWDCPCOL_ProceduresGlobales.term();

}

/**
 * Lancer de l'application Android
 */
public static class WDLanceur extends WDAbstractLanceur
{
public Class<? extends WDProjet> getClasseProjet()
{
return GWDPSante.class;
}
}
}
