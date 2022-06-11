/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Collection
 * Classe Android : COL_ProcéduresGlobales
 * Date : 04/06/2022 22:12:53
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
ms_instance.initExecProcGlobale("watchdog_patient");

try
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_x = new WDChaineU();

WDObjet vWD_bTrouve = new WDBooleen();



// x est une chaîne


// bTrouve est un booléen


// HLitPremier(patient_local)
WDAPIHF.hLitPremier(WDAPIHF.getFichierSansCasseNiAccent("patient_local"));

// HFiltreIdentique(Traitement,Login_pt,patient_local.login)
WDAPIHF.hFiltreIdentique(WDAPIHF.getFichierSansCasseNiAccent("traitement"),WDAPIHF.getRubriqueSansCasseNiAccent("login_pt"),WDAPIHF.getFichierSansCasseNiAccent("patient_local").getRubriqueSansCasseNiAccent("login"));

// POUR CHAQUE Traitement 
IWDParcours parcours1 = null;
try
{
parcours1 = WDParcoursFichier.pourTout(WDAPIHF.getFichierSansCasseNiAccent("traitement"), null, true);
while(parcours1.testParcours())
{
// 	POUR CHAQUE Prises_medicaments 
IWDParcours parcours2 = null;
try
{
parcours2 = WDParcoursFichier.pourTout(WDAPIHF.getFichierSansCasseNiAccent("prises_medicaments"), null, true);
while(parcours2.testParcours())
{
// 		SI Traitement.Login_pt = Prises_medicaments.Login_pt ET Traitement.Nom_med = Prises_medicaments.Nom_med ET Traitement.Heure = Prises_medicaments.Heure ALORS
if(((WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("login_pt").opEgal(WDAPIHF.getFichierSansCasseNiAccent("prises_medicaments").getRubriqueSansCasseNiAccent("login_pt")) & WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("nom_med").opEgal(WDAPIHF.getFichierSansCasseNiAccent("prises_medicaments").getRubriqueSansCasseNiAccent("nom_med"))) & WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("heure").opEgal(WDAPIHF.getFichierSansCasseNiAccent("prises_medicaments").getRubriqueSansCasseNiAccent("heure"))))
{
// 			SI Prises_medicaments.date_prise_medicament = DateDuJour() ALORS
if(WDAPIHF.getFichierSansCasseNiAccent("prises_medicaments").getRubriqueSansCasseNiAccent("date_prise_medicament").opEgal(WDAPIDate.dateDuJour()))
{
// 			bTrouve = Vrai
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
if((vWD_bTrouve.opEgal(false) & WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("heure").opInfEgal(WDAPIDate.heureSys())))
{
// 		x	= Traitement.Heure
vWD_x.setValeur(WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("heure"));

// 		x	= Milieu(x,1,2) + ":" + Milieu(x,3,2)
vWD_x.setValeur(WDAPIChaine.milieu(vWD_x,1,2).opPlus(":").opPlus(WDAPIChaine.milieu(vWD_x,3,2)));

// 		notif est une Notification 
WDObjet vWD_notif = WDVarNonAllouee.ref;
vWD_notif = new WDInstance( new WDNotification() );


// 		notif.Titre		="Nouveau message reçu"
vWD_notif.setProp(EWDPropriete.PROP_TITRE,"Nouveau message reçu");

// 		notif.Message	="Alerte Santé"
vWD_notif.setProp(EWDPropriete.PROP_MESSAGE,"Alerte Santé");

// 		notif.Message	="Veuillez prendre votre médicament : " + Traitement.Nom_med + " de : " + x
vWD_notif.setProp(EWDPropriete.PROP_MESSAGE,new WDChaineU("Veuillez prendre votre médicament : ").opPlus(WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("nom_med")).opPlus(" de : ").opPlus(vWD_x));

// 		NotifAjoute(notif) 
WDAPINotification.notifAjoute(vWD_notif);

}
else
{
// 			bTrouve = Faux
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
// PROCEDURE watchdog_parrain()
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
WDAPIHF.hLitPremier(WDAPIHF.getFichierSansCasseNiAccent("patient_local"));

// btrouve	est un booléen	= Faux

vWD_btrouve.setValeur(false);


// x		est une chaîne


// HFiltreIdentique(Traitement,login_pt,patient_local.login)
WDAPIHF.hFiltreIdentique(WDAPIHF.getFichierSansCasseNiAccent("traitement"),WDAPIHF.getRubriqueSansCasseNiAccent("login_pt"),WDAPIHF.getFichierSansCasseNiAccent("patient_local").getRubriqueSansCasseNiAccent("login"));

// POUR CHAQUE Traitement 
IWDParcours parcours3 = null;
try
{
parcours3 = WDParcoursFichier.pourTout(WDAPIHF.getFichierSansCasseNiAccent("traitement"), null, true);
while(parcours3.testParcours())
{
// 	POUR CHAQUE Prises_medicaments 
IWDParcours parcours4 = null;
try
{
parcours4 = WDParcoursFichier.pourTout(WDAPIHF.getFichierSansCasseNiAccent("prises_medicaments"), null, true);
while(parcours4.testParcours())
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
if(parcours4 != null)
{
parcours4.finParcours();
}
}


// 	SI btrouve = Faux ET Traitement.Heure <= HeureSys() ALORS
if((vWD_btrouve.opEgal(false) & WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("heure").opInfEgal(WDAPIDate.heureSys())))
{
// 		x	= Traitement.Heure
vWD_x.setValeur(WDAPIHF.getFichierSansCasseNiAccent("traitement").getRubriqueSansCasseNiAccent("heure"));

// 		x	= Milieu(x,1,2) + ":" + Milieu(x,3,2)
vWD_x.setValeur(WDAPIChaine.milieu(vWD_x,1,2).opPlus(":").opPlus(WDAPIChaine.milieu(vWD_x,3,2)));

// 				notif est une notification 
WDObjet vWD_notif = WDVarNonAllouee.ref;
vWD_notif = new WDInstance( new WDNotification() );


// 				notif.Titre   ="Nouveau message reçu"
vWD_notif.setProp(EWDPropriete.PROP_TITRE,"Nouveau message reçu");

// 				notif.Message ="Alerte Santé"
vWD_notif.setProp(EWDPropriete.PROP_MESSAGE,"Alerte Santé");

// 				notif.Message ="Votre patient doit prendre ses médicaments" 
vWD_notif.setProp(EWDPropriete.PROP_MESSAGE,"Votre patient doit prendre ses médicaments");

// 				NotifAjoute(notif) 
WDAPINotification.notifAjoute(vWD_notif);

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
