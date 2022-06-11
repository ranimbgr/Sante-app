/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Projet
 * Classe Android : Santé
 * Date : 06/06/2022 10:45:55
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

 // FEN_parrain
public GWDFFEN_parrain mWD_FEN_parrain = new GWDFFEN_parrain();
 // accesseur de FEN_parrain
public GWDFFEN_parrain getFEN_parrain()
{
mWD_FEN_parrain.checkOuverture();
return mWD_FEN_parrain;
}

 // FEN_patient_param
public GWDFFEN_patient_param mWD_FEN_patient_param = new GWDFFEN_patient_param();
 // accesseur de FEN_patient_param
public GWDFFEN_patient_param getFEN_patient_param()
{
mWD_FEN_patient_param.checkOuverture();
return mWD_FEN_patient_param;
}

 // FEN_parrain_param
public GWDFFEN_parrain_param mWD_FEN_parrain_param = new GWDFFEN_parrain_param();
 // accesseur de FEN_parrain_param
public GWDFFEN_parrain_param getFEN_parrain_param()
{
mWD_FEN_parrain_param.checkOuverture();
return mWD_FEN_parrain_param;
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
ajouterFenetre("FEN_parrain", mWD_FEN_parrain);
ajouterFenetre("FEN_patient_param", mWD_FEN_patient_param);
ajouterFenetre("FEN_parrain_param", mWD_FEN_parrain_param);

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
public String getVersionApplication(){ return "0.0.32.0";}
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
super.ajouterFichierAssocie("C:\\USERS\\RANIM\\DESKTOP\\SANTÉ - CS\\GABARITS\\WM\\180 POULCO\\POULCO_BTN_STD.PNG?E5_A1A6A1A6A1_3NP_8_8_10_10",com.masociete.sante.R.drawable.poulco_btn_std_3_np3_8_8_10_10_selector_animh1t0h6t150h1t0h6t150h1t0, "");
super.ajouterFichierAssocie("C:\\USERS\\RANIM\\DESKTOP\\SANTÉ - CS\\HTA-SUIVI-TRAITEMENT.JPG",com.masociete.sante.R.drawable.hta_suivi_traitement_4, "");
super.ajouterFichierAssocie("C:\\USERS\\RANIM\\DESKTOP\\SANTÉ - CS\\GABARITS\\WM\\180 POULCO\\POULCO_COMBO.PNG?E5_3NP_32_6_42_6",com.masociete.sante.R.drawable.poulco_combo_5_np3_32_6_42_6_selector, "");
super.ajouterFichierAssocie("C:\\USERS\\RANIM\\DESKTOP\\SANTÉ - CS\\GABARITS\\WM\\180 POULCO\\POULCO_EDT.PNG?E5_3NP_8_8_8_8",com.masociete.sante.R.drawable.poulco_edt_6_np3_8_8_8_8_selector, "");
super.ajouterFichierAssocie("C:\\USERS\\RANIM\\DESKTOP\\SANTÉ - CS\\GABARITS\\WM\\180 POULCO\\POULCO_CBOX_TABLE.PNG?E12_A1A6A1A6A1A6A1A6A1A6A1A6_8O",com.masociete.sante.R.drawable.poulco_cbox_table_7_selector_animh1t0h6t150h1t0h6t150h1t0h6t150h1t0h6t150h1t0h6t150h1t0h6t150, "");
super.ajouterFichierAssocie("C:\\USERS\\RANIM\\DESKTOP\\SANTÉ - CS\\GABARITS\\WM\\180 POULCO\\POULCO_SELECT.JPG?E5_3NP_4_4_4_4",com.masociete.sante.R.drawable.poulco_select_8_np3_4_4_4_4_selector, "");
super.ajouterFichierAssocie("C:\\Users\\Ranim\\Desktop\\Santé - CS\\PLUS.PNG",com.masociete.sante.R.drawable.plus_9, "");
super.ajouterFichierAssocie("C:\\USERS\\RANIM\\DESKTOP\\SANTÉ - CS\\GABARITS\\WM\\180 POULCO\\POULCO_ROLLOVER.PNG",com.masociete.sante.R.drawable.poulco_rollover_10, "");
super.ajouterFichierAssocie("C:\\USERS\\RANIM\\DESKTOP\\SANTÉ - CS\\GABARITS\\WM\\180 POULCO\\POULCO_TABLE_COLPICT.PNG",com.masociete.sante.R.drawable.poulco_table_colpict_11, "");
super.ajouterFichierAssocie("C:\\USERS\\RANIM\\DESKTOP\\SANTÉ - CS\\GABARITS\\WM\\180 POULCO\\POULCO_TABLE_COLTITLE.PNG?E5_3NP_4_4_4_4",com.masociete.sante.R.drawable.poulco_table_coltitle_12_np3_4_4_4_4_selector, "");
super.ajouterFichierAssocie("C:\\USERS\\RANIM\\DESKTOP\\SANTÉ - CS\\IMG-DOUBLE-ANCRAGE.SVG",com.masociete.sante.R.raw.img_double_ancrage_13, "");
super.ajouterFichierAssocie("C:\\USERS\\RANIM\\DESKTOP\\SANTÉ - CS\\PERSONNE.PNG",com.masociete.sante.R.drawable.personne_14, "");
}

////////////////////////////////////////////////////////////////////////////
// Dialogues avec Question
////////////////////////////////////////////////////////////////////////////
public WDObjet afficherDialogue(int nIdQuestion, String... params)
{
switch(nIdQuestion)
{
case 0 : return WDAPIDialogue.dialogue("Supprimer oui/non ?", new String[] {"&Supprimer", "&Ne pas supprimer"} , new int[] {1, 2} , 0, 1, 1, "", 1, com.masociete.sante.R.raw.question_1324003937640029402_1_15, params);

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
case 0 : return WDAPIDialogue.saisie("Supprimer oui/non ?", new String[] {"&Supprimer", "&Ne pas supprimer"} , new int[] {1, 2} , 0, 1, 1, "", 1, com.masociete.sante.R.raw.question_1324003937640029402_1_15, variable, params);

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
