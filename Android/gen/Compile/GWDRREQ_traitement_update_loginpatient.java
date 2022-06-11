/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Requête
 * Classe Android : REQ_traitement_update_loginpatient
 * Date : 30/05/2022 01:19:40
 * Version de wdjava.dll  : 25.0.221.6
 */


package com.masociete.sante.wdgen;


import com.masociete.sante.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.database.hf.requete.parsing.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDRREQ_traitement_update_loginpatient extends WDDescRequeteWDR
{
public String getNomLogique()
{
return "REQ_traitement_update_loginpatient";
}
public String getCodeSQLOriginal()
{
return " UPDATE  Traitement SET Login_pt = {Paramaffectation#0}  WHERE   Traitement.Login_pt = {Paramcondition#1}";
}
public Requete initArbre() throws WDInvalidSQLException
{
Fichier fic_Traitement = new Fichier();
fic_Traitement.setNom("Traitement");
fic_Traitement.setAlias("Traitement");
Requete varReqUpdate = new Requete(3);
varReqUpdate.ajouterClause(fic_Traitement);
Set varSet = new Set();
Rubrique rub_Login_pt = new Rubrique();
rub_Login_pt.setNom("Traitement.Login_pt");
rub_Login_pt.setAlias("Login_pt");
rub_Login_pt.setNomFichier("Traitement");
rub_Login_pt.setAliasFichier("Traitement");
Parametre param_Paramaffectation = new Parametre();
param_Paramaffectation.setNom("Paramaffectation");
varSet.ajouterElement(rub_Login_pt);
varSet.ajouterElement(param_Paramaffectation);
varReqUpdate.ajouterClause(varSet);
Expression expr__ = new Expression(9, "=", "Traitement.Login_pt = {Paramcondition}");
Rubrique rub_Login_pt_1 = new Rubrique();
rub_Login_pt_1.setNom("Traitement.Login_pt");
rub_Login_pt_1.setAlias("Login_pt");
rub_Login_pt_1.setNomFichier("Traitement");
rub_Login_pt_1.setAliasFichier("Traitement");
expr__.ajouterElement(rub_Login_pt_1);
Parametre param_Paramcondition = new Parametre();
param_Paramcondition.setNom("Paramcondition");
expr__.ajouterElement(param_Paramcondition);
Where varWhere = new Where();
varWhere.ajouterElement(expr__);
varReqUpdate.ajouterClause(varWhere);
return varReqUpdate;
}
public String getNomFichier(int nIndex)
{
switch(nIndex)
{
case 0 : return "Traitement";
default: return null;
}
}
public String getAliasFichier(int nIndex)
{
switch(nIndex)
{
case 0 : return "Traitement";
default: return null;
}
}


public int getIdWDR()
{
return com.masociete.sante.R.raw.req_update_traitement_login;
}
public String getNomFichierWDR()
{
return "req_update_traitement_login";
}
}
