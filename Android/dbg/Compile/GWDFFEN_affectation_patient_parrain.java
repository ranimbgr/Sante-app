/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_affectation_patient_parrain
 * Date : 30/05/2022 10:25:11
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
import fr.pcsoft.wdjava.ui.champs.image.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_affectation_patient_parrain extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_affectation_patient_parrain
////////////////////////////////////////////////////////////////////////////

/**
 * LIB_Pseudo
 */
class GWDLIB_Pseudo extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_affectation_patient_parrain.LIB_Pseudo
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2477358224645804593l);

super.setChecksum("600387511");

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
 * SAI_Login_Parrain
 */
class GWDSAI_Login_Parrain extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_affectation_patient_parrain.SAI_Login_Parrain
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,316,21);
super.setRectCompPrincipal(0,21,316,40);
super.setQuid(2477360565411914682l);

super.setChecksum("609321369");

super.setNom("SAI_Login_Parrain");

super.setType(20001);

super.setBulle("");

super.setLibelle("Login Parrain");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(3, 63);

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

super.setStyleLibelle(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0DCDA, 0x605C5A, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("F:\\Santé\\Gabarits\\WM\\250 Phoenix\\Phoenix_Edt@dpi1x.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFF, 1, 5));

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
public GWDSAI_Login_Parrain mWD_SAI_Login_Parrain;

/**
 * IMG_plus
 */
class GWDIMG_plus extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_affectation_patient_parrain.IMG_plus
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2477360625542125930l);

super.setChecksum("609993223");

super.setNom("IMG_plus");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(265, 134);

super.setTailleInitiale(43, 38);

super.setValeurInitiale("F:\\Santé\\plus.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

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
 * Traitement: Clic sur IMG_plus
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// 
//MAP:22615a5d01fa596a:00000012:1:FEN_affectation_patient_parrain.IMG_plus:com.masociete.sante.wdgen.GWDFFEN_affectation_patient_parrain$GWDIMG_plus:Clic sur IMG_plus

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_y = new WDBuffer();



// y est un buffer
//MAP:22615a5d01fa596a:00000012:2:FEN_affectation_patient_parrain.IMG_plus:com.masociete.sante.wdgen.GWDFFEN_affectation_patient_parrain$GWDIMG_plus:Clic sur IMG_plus


// si SAI_Login_Parrain = "" ALORS
//MAP:22615a5d01fa596a:00000012:4:FEN_affectation_patient_parrain.IMG_plus:com.masociete.sante.wdgen.GWDFFEN_affectation_patient_parrain$GWDIMG_plus:Clic sur IMG_plus
if(mWD_SAI_Login_Parrain.opEgal(""))
{
// 	info("Veuillez remplir le champ parrain")
//MAP:22615a5d01fa596a:00000012:6:FEN_affectation_patient_parrain.IMG_plus:com.masociete.sante.wdgen.GWDFFEN_affectation_patient_parrain$GWDIMG_plus:Clic sur IMG_plus
WDAPIDialogue.info("Veuillez remplir le champ parrain");

}
else
{
// 	si HLitRecherche(parrain,login_pr,SAI_Login_Parrain,hIdentique) = Faux ALORS
//MAP:22615a5d01fa596a:00000012:b:FEN_affectation_patient_parrain.IMG_plus:com.masociete.sante.wdgen.GWDFFEN_affectation_patient_parrain$GWDIMG_plus:Clic sur IMG_plus
if(WDAPIHF.hLitRecherche(WDAPIHF.getFichierSansCasseNiAccent("parrain"),WDAPIHF.getRubriqueSansCasseNiAccent("login_pr"),mWD_SAI_Login_Parrain,(long)524288).opEgal(false))
{
// 		info("Parrain inéxistant")
//MAP:22615a5d01fa596a:00000012:d:FEN_affectation_patient_parrain.IMG_plus:com.masociete.sante.wdgen.GWDFFEN_affectation_patient_parrain$GWDIMG_plus:Clic sur IMG_plus
WDAPIDialogue.info("Parrain inéxistant");

}
else
{
// 		REQ_trouve_parrainage.ParamLogin_pt = LIB_Pseudo
//MAP:22615a5d01fa596a:00000012:15:FEN_affectation_patient_parrain.IMG_plus:com.masociete.sante.wdgen.GWDFFEN_affectation_patient_parrain$GWDIMG_plus:Clic sur IMG_plus
WDAPIHF.getFichierSansCasseNiAccent("req_trouve_parrainage").getRubriqueSansCasseNiAccent("paramlogin_pt").setValeur(mWD_LIB_Pseudo);

// 		REQ_trouve_parrainage.ParamLogin_pr = SAI_Login_Parrain
//MAP:22615a5d01fa596a:00000012:16:FEN_affectation_patient_parrain.IMG_plus:com.masociete.sante.wdgen.GWDFFEN_affectation_patient_parrain$GWDIMG_plus:Clic sur IMG_plus
WDAPIHF.getFichierSansCasseNiAccent("req_trouve_parrainage").getRubriqueSansCasseNiAccent("paramlogin_pr").setValeur(mWD_SAI_Login_Parrain);

// 		HExécuteRequête(REQ_trouve_parrainage)
//MAP:22615a5d01fa596a:00000012:18:FEN_affectation_patient_parrain.IMG_plus:com.masociete.sante.wdgen.GWDFFEN_affectation_patient_parrain$GWDIMG_plus:Clic sur IMG_plus
WDAPIHF.hExecuteRequete(WDAPIHF.getRequeteSansCasseNiAccent("req_trouve_parrainage"));

// 		si HNbEnr(REQ_trouve_parrainage) = 1 ALORS
//MAP:22615a5d01fa596a:00000012:1c:FEN_affectation_patient_parrain.IMG_plus:com.masociete.sante.wdgen.GWDFFEN_affectation_patient_parrain$GWDIMG_plus:Clic sur IMG_plus
if(WDAPIHF.hNbEnr(WDAPIHF.getRequeteSansCasseNiAccent("req_trouve_parrainage")).opEgal(1))
{
// 			info("L'affectation est déjà enregistrée")
//MAP:22615a5d01fa596a:00000012:20:FEN_affectation_patient_parrain.IMG_plus:com.masociete.sante.wdgen.GWDFFEN_affectation_patient_parrain$GWDIMG_plus:Clic sur IMG_plus
WDAPIDialogue.info("L'affectation est déjà enregistrée");

}
else
{
// 			patient_parrain.Login_pt = LIB_Pseudo
//MAP:22615a5d01fa596a:00000012:26:FEN_affectation_patient_parrain.IMG_plus:com.masociete.sante.wdgen.GWDFFEN_affectation_patient_parrain$GWDIMG_plus:Clic sur IMG_plus
WDAPIHF.getFichierSansCasseNiAccent("patient_parrain").getRubriqueSansCasseNiAccent("login_pt").setValeur(mWD_LIB_Pseudo);

// 			patient_parrain.Login_pr = SAI_Login_Parrain
//MAP:22615a5d01fa596a:00000012:27:FEN_affectation_patient_parrain.IMG_plus:com.masociete.sante.wdgen.GWDFFEN_affectation_patient_parrain$GWDIMG_plus:Clic sur IMG_plus
WDAPIHF.getFichierSansCasseNiAccent("patient_parrain").getRubriqueSansCasseNiAccent("login_pr").setValeur(mWD_SAI_Login_Parrain);

// 			HAjoute(patient_parrain)
//MAP:22615a5d01fa596a:00000012:29:FEN_affectation_patient_parrain.IMG_plus:com.masociete.sante.wdgen.GWDFFEN_affectation_patient_parrain$GWDIMG_plus:Clic sur IMG_plus
WDAPIHF.hAjoute(WDAPIHF.getFichierSansCasseNiAccent("patient_parrain"));

// 			info("Parrainage réalisé avec succès")
//MAP:22615a5d01fa596a:00000012:2b:FEN_affectation_patient_parrain.IMG_plus:com.masociete.sante.wdgen.GWDFFEN_affectation_patient_parrain$GWDIMG_plus:Clic sur IMG_plus
WDAPIDialogue.info("Parrainage réalisé avec succès");

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
public GWDIMG_plus mWD_IMG_plus;

/**
 * ACTB_ActionBar
 */
class GWDACTB_ActionBar extends WDActionBar
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_affectation_patient_parrain.ACTB_ActionBar
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
 * Traitement: Déclarations globales de FEN_affectation_patient_parrain
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCÉDURE MaFenêtre(gsPseudo)
//MAP:226158110162602d:00000000:1:FEN_affectation_patient_parrain:com.masociete.sante.wdgen.GWDFFEN_affectation_patient_parrain:Déclarations globales de FEN_affectation_patient_parrain
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


}




/**
 * Traitement: Prise de focus de FEN_affectation_patient_parrain
 */
public void priseDeFocus()
{
super.priseDeFocus();

// 
//MAP:226158110162602d:0000000b:1:FEN_affectation_patient_parrain:com.masociete.sante.wdgen.GWDFFEN_affectation_patient_parrain:Prise de focus de FEN_affectation_patient_parrain
// LIB_Pseudo = gsPseudo
//MAP:226158110162602d:0000000b:2:FEN_affectation_patient_parrain:com.masociete.sante.wdgen.GWDFFEN_affectation_patient_parrain:Prise de focus de FEN_affectation_patient_parrain
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
// Création des champs de la fenêtre FEN_affectation_patient_parrain
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_LIB_Pseudo = new GWDLIB_Pseudo();
mWD_SAI_Login_Parrain = new GWDSAI_Login_Parrain();
mWD_IMG_plus = new GWDIMG_plus();
mWD_ACTB_ActionBar = new GWDACTB_ActionBar();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_affectation_patient_parrain
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2477358100091396141l);

super.setChecksum("605299255");

super.setNom("FEN_affectation_patient_parrain");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 495);

super.setTitre("");

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
// Initialisation des champs de FEN_affectation_patient_parrain
////////////////////////////////////////////////////////////////////////////
mWD_LIB_Pseudo.initialiserObjet();
super.ajouter("LIB_Pseudo", mWD_LIB_Pseudo);
mWD_SAI_Login_Parrain.initialiserObjet();
super.ajouter("SAI_Login_Parrain", mWD_SAI_Login_Parrain);
mWD_IMG_plus.initialiserObjet();
super.ajouter("IMG_plus", mWD_IMG_plus);
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
return GWDPSante.getInstance().mWD_FEN_affectation_patient_parrain;
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
