/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Collection
 * Classe Android : COL_ProcéduresGlobales
 * Date : 30/05/2022 10:25:11
 * Version de wdjava.dll  : 25.0.221.6
 */


package com.masociete.sante.wdgen;


import com.masociete.sante.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.core.parcours.*;
import fr.pcsoft.wdjava.core.parcours.hf.*;
import fr.pcsoft.wdjava.notification.*;
import fr.pcsoft.wdjava.core.poo.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDCPCOL_ProceduresGlobales extends WDCollProcAndroid
{

public WDProjet getProjet()
{
return GWDPSante.getInstance();
}

public IWDEnsembleElement getEnsemble()
{
return GWDPSante.getInstance();
}

protected String getNomCollection()
{
return "COL_ProcéduresGlobales";
}
private final static GWDCPCOL_ProceduresGlobales ms_instance = new GWDCPCOL_ProceduresGlobales();
public final static GWDCPCOL_ProceduresGlobales getInstance()
{
return ms_instance;
}

// Code de déclaration de COL_ProcéduresGlobales
static public void init()
{
// 
//MAP:125599c100096a09:000b0000:1:COL_ProcéduresGlobales:com.masociete.sante.wdgen.GWDCPCOL_ProceduresGlobales:Déclaration de COL_ProcéduresGlobales
ms_instance.initDeclarationCollection();

try
{
}
finally
{
finDeclarationCollection();
}

}




// Code de terminaison de COL_ProcéduresGlobales
static public void term()
{
// 
//MAP:125599c100096a09:000b0002:1:COL_ProcéduresGlobales:com.masociete.sante.wdgen.GWDCPCOL_ProceduresGlobales:Terminaison de COL_ProcéduresGlobales
ms_instance.initTerminaisonCollection();

try
{
}
finally
{
finTerminaisonCollection();
}

}



// Nombre de Procédures : 2
static public void fWD_watchdog_patient()
{
// PROCÉDURE watchdog_patient()
//MAP:125599e9000a086a:00070000:2:COL_ProcéduresGlobales.watchdog_patient:com.masociete.sante.wdgen.GWDCPCOL_ProceduresGlobales:watchdog_patient
ms_instance.initExecProcGlobale("watchdog_patient");

try
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_x = new WDChaineU();

WDObjet vWD_y = new WDBuffer();

WDObjet vWD_bTrouve = new WDBooleen();



// x est une chaîne
//MAP:125599e9000a086a:00070000:3:COL_ProcéduresGlobales.watchdog_patient:com.masociete.sante.wdgen.GWDCPCOL_ProceduresGlobales:watchdog_patient


// y est un Buffer
//MAP:125599e9000a086a:00070000:4:COL_ProcéduresGlobales.watchdog_patient:com.masociete.sante.wdgen.GWDCPCOL_ProceduresGlobales:watchdog_patient


// bTrouve est un booléen
//MAP:125599e9000a086a:00070000:5:COL_ProcéduresGlobales.watchdog_patient:com.masociete.sante.wdgen.GWDCPCOL_ProceduresGlobales:watchdog_patient


// HLitPremier(patient_local)
//MAP:125599e9000a086a:00070000:8:COL_ProcéduresGlobales.watchdog_patient:com.masociete.sante.wdgen.GWDCPCOL_ProceduresGlobales:watchdog_patient
WDAPIHF.hLitPremier(WDAPIHF.getFichierSansCasseNiAccent("patient_local"));

// HFiltreIdentique(Traitement,Login_pt,patient_local.login)
//MAP:125599e9000a086a:00070000:b:COL_ProcéduresGlobales.watchdog_patient:com.masociete.sante.wdgen.GWDCPCOL_ProceduresGlobales:watchdog_patient
WDAPIHF.hFiltreIdentique(WDAPIHF.getFichierSansCasseNiAccent("traitement"),WDAPIHF.getRubriqueSansCasseNiAccent("login_pt"),WDAPIHF.getFichierSansCasseNiAccent("patient_local").getRubriqueSansCasseNiAccent("login"));

// POUR CHAQUE Traitement 
//MAP:125599e9000a086a:00070000:f:COL_ProcéduresGlobales.watchdog_patient:com.masociete.sante.wdgen.GWDCPCOL_ProceduresGlobales:watchdog_patient
IWDParcours parcours1 = null;
try
{
parcours1 = WDParcoursFichier.pourTout(WDAPIHF.getFichierSansCasseNiAccent("traitement"), null, true);
while(parcours1.testParcours())
{
// 	POUR CHAQUE Prises_medicaments 
//MAP:125599e9000a086a:00070000:19:COL_ProcéduresGlobales.watchdog_patient:com.masociete.sante.wdgen.GWDCPCOL_ProceduresGlobales:watchdog_patient
IWDParcours parcours2 = null;
try
{
parcours2 = WDParcoursFichier.pourTout(WDAPIHF.getFichierSansCasseNiAccent("prises_medicaments"), null, true);
while(parcours2.testParcours())
{
// 		SI Traitement.Login_pt = Prises_medicaments.Login_pt ET Traitement.Nom_med = Prises_medicaments.Nom_med ET Traitement.Heure = Prises_medicaments.Heure ALORS
//MAP:125599e9000a086a:00070000:1c:COL_ProcéduresGlobales.watchdog_patient:com.masociete.sante.wdgen.GWDCPCOL_ProceduresGlobales:watchdog_patient
if(((WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("login_pt").opEgal(WDAPIHF.getFichierSansCasseNiAccent("prises_medicaments").getRubriqueSansCasseNiAccent("login_pt")) & WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("nom_med").opEgal(WDAPIHF.getFichierSansCasseNiAccent("prises_medicaments").getRubriqueSansCasseNiAccent("nom_med"))) & WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("heure").opEgal(WDAPIHF.getFichierSansCasseNiAccent("prises_medicaments").getRubriqueSansCasseNiAccent("heure"))))
{
// 			SI Prises_medicaments.date_prise_medicament = DateDuJour() ALORS
//MAP:125599e9000a086a:00070000:1e:COL_ProcéduresGlobales.watchdog_patient:com.masociete.sante.wdgen.GWDCPCOL_ProceduresGlobales:watchdog_patient
if(WDAPIHF.getFichierSansCasseNiAccent("prises_medicaments").getRubriqueSansCasseNiAccent("date_prise_medicament").opEgal(WDAPIDate.dateDuJour()))
{
// 			bTrouve = Vrai
//MAP:125599e9000a086a:00070000:20:COL_ProcéduresGlobales.watchdog_patient:com.masociete.sante.wdgen.GWDCPCOL_ProceduresGlobales:watchdog_patient
vWD_bTrouve.setValeur(true);

}

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


// 	SI bTrouve = Faux ET Traitement.Heure <= HeureSys() ALORS
//MAP:125599e9000a086a:00070000:2c:COL_ProcéduresGlobales.watchdog_patient:com.masociete.sante.wdgen.GWDCPCOL_ProceduresGlobales:watchdog_patient
if((vWD_bTrouve.opEgal(false) & WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("heure").opInfEgal(WDAPIDate.heureSys())))
{
// 		x	= Traitement.Heure
//MAP:125599e9000a086a:00070000:2f:COL_ProcéduresGlobales.watchdog_patient:com.masociete.sante.wdgen.GWDCPCOL_ProceduresGlobales:watchdog_patient
vWD_x.setValeur(WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("heure"));

// 		x	= Milieu(x,1,2) + ":" + Milieu(x,3,2)
//MAP:125599e9000a086a:00070000:30:COL_ProcéduresGlobales.watchdog_patient:com.masociete.sante.wdgen.GWDCPCOL_ProceduresGlobales:watchdog_patient
vWD_x.setValeur(WDAPIChaine.milieu(vWD_x,1,2).opPlus(":").opPlus(WDAPIChaine.milieu(vWD_x,3,2)));

// 		notif est une Notification 
//MAP:125599e9000a086a:00070000:34:COL_ProcéduresGlobales.watchdog_patient:com.masociete.sante.wdgen.GWDCPCOL_ProceduresGlobales:watchdog_patient
WDObjet vWD_notif = WDVarNonAllouee.ref;
vWD_notif = new WDInstance( new WDNotification() );


// 		notif.Titre		="Nouveau message reçu"
//MAP:125599e9000a086a:00070000:35:COL_ProcéduresGlobales.watchdog_patient:com.masociete.sante.wdgen.GWDCPCOL_ProceduresGlobales:watchdog_patient
vWD_notif.setProp(EWDPropriete.PROP_TITRE,"Nouveau message reçu");

// 		notif.Message	="Alerte Santé"
//MAP:125599e9000a086a:00070000:36:COL_ProcéduresGlobales.watchdog_patient:com.masociete.sante.wdgen.GWDCPCOL_ProceduresGlobales:watchdog_patient
vWD_notif.setProp(EWDPropriete.PROP_MESSAGE,"Alerte Santé");

// 		notif.Message	="Veuillez prendre votre médicament : " + Traitement.Nom_med + " de : " + x
//MAP:125599e9000a086a:00070000:37:COL_ProcéduresGlobales.watchdog_patient:com.masociete.sante.wdgen.GWDCPCOL_ProceduresGlobales:watchdog_patient
vWD_notif.setProp(EWDPropriete.PROP_MESSAGE,new WDChaineU("Veuillez prendre votre médicament : ").opPlus(WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("nom_med")).opPlus(" de : ").opPlus(vWD_x));

// 		NotifAjoute(notif) 
//MAP:125599e9000a086a:00070000:38:COL_ProcéduresGlobales.watchdog_patient:com.masociete.sante.wdgen.GWDCPCOL_ProceduresGlobales:watchdog_patient
WDAPINotification.notifAjoute(vWD_notif);

}
else
{
// 			bTrouve = Faux
//MAP:125599e9000a086a:00070000:3f:COL_ProcéduresGlobales.watchdog_patient:com.masociete.sante.wdgen.GWDCPCOL_ProceduresGlobales:watchdog_patient
vWD_bTrouve.setValeur(false);

}

}
}
finally
{
if(parcours1 != null)
{
parcours1.finParcours();
}
}


}
finally
{
finExecProcGlobale();
}

}


static public void fWD_watchdog_parrain()
{
// PROCÉDURE watchdog_parrain()
//MAP:128e2c91000bd74b:00070000:2:COL_ProcéduresGlobales.watchdog_parrain:com.masociete.sante.wdgen.GWDCPCOL_ProceduresGlobales:watchdog_parrain
ms_instance.initExecProcGlobale("watchdog_parrain");

try
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_btrouve = new WDBooleen();

WDObjet vWD_x = new WDChaineU();



// HLitPremier(patient_local)
//MAP:128e2c91000bd74b:00070000:6:COL_ProcéduresGlobales.watchdog_parrain:com.masociete.sante.wdgen.GWDCPCOL_ProceduresGlobales:watchdog_parrain
WDAPIHF.hLitPremier(WDAPIHF.getFichierSansCasseNiAccent("patient_local"));

// bTrouve	est un booléen	= Faux
//MAP:128e2c91000bd74b:00070000:c:COL_ProcéduresGlobales.watchdog_parrain:com.masociete.sante.wdgen.GWDCPCOL_ProceduresGlobales:watchdog_parrain

vWD_btrouve.setValeur(false);


// x		est une chaîne
//MAP:128e2c91000bd74b:00070000:d:COL_ProcéduresGlobales.watchdog_parrain:com.masociete.sante.wdgen.GWDCPCOL_ProceduresGlobales:watchdog_parrain


// HFiltreIdentique(Traitement,Login_pt,patient_local.login)
//MAP:128e2c91000bd74b:00070000:f:COL_ProcéduresGlobales.watchdog_parrain:com.masociete.sante.wdgen.GWDCPCOL_ProceduresGlobales:watchdog_parrain
WDAPIHF.hFiltreIdentique(WDAPIHF.getFichierSansCasseNiAccent("traitement"),WDAPIHF.getRubriqueSansCasseNiAccent("login_pt"),WDAPIHF.getFichierSansCasseNiAccent("patient_local").getRubriqueSansCasseNiAccent("login"));

// POUR CHAQUE Traitement 
//MAP:128e2c91000bd74b:00070000:12:COL_ProcéduresGlobales.watchdog_parrain:com.masociete.sante.wdgen.GWDCPCOL_ProceduresGlobales:watchdog_parrain
IWDParcours parcours3 = null;
try
{
parcours3 = WDParcoursFichier.pourTout(WDAPIHF.getFichierSansCasseNiAccent("traitement"), null, true);
while(parcours3.testParcours())
{
// 	POUR CHAQUE Prises_medicaments 
//MAP:128e2c91000bd74b:00070000:17:COL_ProcéduresGlobales.watchdog_parrain:com.masociete.sante.wdgen.GWDCPCOL_ProceduresGlobales:watchdog_parrain
IWDParcours parcours4 = null;
try
{
parcours4 = WDParcoursFichier.pourTout(WDAPIHF.getFichierSansCasseNiAccent("prises_medicaments"), null, true);
while(parcours4.testParcours())
{
// 		SI Traitement.Login_pt = Prises_medicaments.Login_pt ET Traitement.Nom_med = Prises_medicaments.Nom_med ET Traitement.Heure = Prises_medicaments.Heure ALORS
//MAP:128e2c91000bd74b:00070000:1a:COL_ProcéduresGlobales.watchdog_parrain:com.masociete.sante.wdgen.GWDCPCOL_ProceduresGlobales:watchdog_parrain
if(((WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("login_pt").opEgal(WDAPIHF.getFichierSansCasseNiAccent("prises_medicaments").getRubriqueSansCasseNiAccent("login_pt")) & WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("nom_med").opEgal(WDAPIHF.getFichierSansCasseNiAccent("prises_medicaments").getRubriqueSansCasseNiAccent("nom_med"))) & WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("heure").opEgal(WDAPIHF.getFichierSansCasseNiAccent("prises_medicaments").getRubriqueSansCasseNiAccent("heure"))))
{
// 			SI Prises_medicaments.date_prise_medicament = DateDuJour() ALORS
//MAP:128e2c91000bd74b:00070000:1c:COL_ProcéduresGlobales.watchdog_parrain:com.masociete.sante.wdgen.GWDCPCOL_ProceduresGlobales:watchdog_parrain
if(WDAPIHF.getFichierSansCasseNiAccent("prises_medicaments").getRubriqueSansCasseNiAccent("date_prise_medicament").opEgal(WDAPIDate.dateDuJour()))
{
// 				bTrouve = Vrai
//MAP:128e2c91000bd74b:00070000:1e:COL_ProcéduresGlobales.watchdog_parrain:com.masociete.sante.wdgen.GWDCPCOL_ProceduresGlobales:watchdog_parrain
vWD_btrouve.setValeur(true);

}

}

}
}
finally
{
if(parcours4 != null)
{
parcours4.finParcours();
}
}


// 	SI bTrouve = Faux ET Traitement.Heure <= HeureSys() ALORS
//MAP:128e2c91000bd74b:00070000:2a:COL_ProcéduresGlobales.watchdog_parrain:com.masociete.sante.wdgen.GWDCPCOL_ProceduresGlobales:watchdog_parrain
if((vWD_btrouve.opEgal(false) & WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("heure").opInfEgal(WDAPIDate.heureSys())))
{
// 		x	= Traitement.Heure
//MAP:128e2c91000bd74b:00070000:2d:COL_ProcéduresGlobales.watchdog_parrain:com.masociete.sante.wdgen.GWDCPCOL_ProceduresGlobales:watchdog_parrain
vWD_x.setValeur(WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("heure"));

// 		x	= Milieu(x,1,2) + ":" + Milieu(x,3,2)
//MAP:128e2c91000bd74b:00070000:2e:COL_ProcéduresGlobales.watchdog_parrain:com.masociete.sante.wdgen.GWDCPCOL_ProceduresGlobales:watchdog_parrain
vWD_x.setValeur(WDAPIChaine.milieu(vWD_x,1,2).opPlus(":").opPlus(WDAPIChaine.milieu(vWD_x,3,2)));

// 				notif est une Notification 
//MAP:128e2c91000bd74b:00070000:32:COL_ProcéduresGlobales.watchdog_parrain:com.masociete.sante.wdgen.GWDCPCOL_ProceduresGlobales:watchdog_parrain
WDObjet vWD_notif = WDVarNonAllouee.ref;
vWD_notif = new WDInstance( new WDNotification() );


// 				notif.Titre   ="Nouveau message reçu"
//MAP:128e2c91000bd74b:00070000:33:COL_ProcéduresGlobales.watchdog_parrain:com.masociete.sante.wdgen.GWDCPCOL_ProceduresGlobales:watchdog_parrain
vWD_notif.setProp(EWDPropriete.PROP_TITRE,"Nouveau message reçu");

// 				notif.Message ="Alerte Santé"
//MAP:128e2c91000bd74b:00070000:34:COL_ProcéduresGlobales.watchdog_parrain:com.masociete.sante.wdgen.GWDCPCOL_ProceduresGlobales:watchdog_parrain
vWD_notif.setProp(EWDPropriete.PROP_MESSAGE,"Alerte Santé");

// 				notif.Message ="Votre patient doit prendre ses médicaments" 
//MAP:128e2c91000bd74b:00070000:35:COL_ProcéduresGlobales.watchdog_parrain:com.masociete.sante.wdgen.GWDCPCOL_ProceduresGlobales:watchdog_parrain
vWD_notif.setProp(EWDPropriete.PROP_MESSAGE,"Votre patient doit prendre ses médicaments");

// 				NotifAjoute(notif) 
//MAP:128e2c91000bd74b:00070000:36:COL_ProcéduresGlobales.watchdog_parrain:com.masociete.sante.wdgen.GWDCPCOL_ProceduresGlobales:watchdog_parrain
WDAPINotification.notifAjoute(vWD_notif);

}
else
{
// 		bTrouve = Faux
//MAP:128e2c91000bd74b:00070000:3f:COL_ProcéduresGlobales.watchdog_parrain:com.masociete.sante.wdgen.GWDCPCOL_ProceduresGlobales:watchdog_parrain
vWD_btrouve.setValeur(false);

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


}
finally
{
finExecProcGlobale();
}

}



////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
