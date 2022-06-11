/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Requête
 * Classe Android : REQ_patient_parrain_update_loginparrain
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



public class GWDRREQ_patient_parrain_update_loginparrain extends WDDescRequeteWDR
{
public String getNomLogique()
{
return "REQ_patient_parrain_update_loginparrain";
}
public String getCodeSQLOriginal()
{
return " UPDATE  patient_parrain SET Login_pr = {Paramaffectation#0}  WHERE   patient_parrain.Login_pr = {Paramcondition#1}";
}
public Requete initArbre() throws WDInvalidSQLException
{
Fichier fic_patient_parrain = new Fichier();
fic_patient_parrain.setNom("patient_parrain");
fic_patient_parrain.setAlias("patient_parrain");
Requete varReqUpdate = new Requete(3);
varReqUpdate.ajouterClause(fic_patient_parrain);
Set varSet = new Set();
Rubrique rub_Login_pr = new Rubrique();
rub_Login_pr.setNom("patient_parrain.Login_pr");
rub_Login_pr.setAlias("Login_pr");
rub_Login_pr.setNomFichier("patient_parrain");
rub_Login_pr.setAliasFichier("patient_parrain");
Parametre param_Paramaffectation = new Parametre();
param_Paramaffectation.setNom("Paramaffectation");
varSet.ajouterElement(rub_Login_pr);
varSet.ajouterElement(param_Paramaffectation);
varReqUpdate.ajouterClause(varSet);
Expression expr__ = new Expression(9, "=", "patient_parrain.Login_pr = {Paramcondition}");
Rubrique rub_Login_pr_1 = new Rubrique();
rub_Login_pr_1.setNom("patient_parrain.Login_pr");
rub_Login_pr_1.setAlias("Login_pr");
rub_Login_pr_1.setNomFichier("patient_parrain");
rub_Login_pr_1.setAliasFichier("patient_parrain");
expr__.ajouterElement(rub_Login_pr_1);
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
case 0 : return "patient_parrain";
default: return null;
}
}
public String getAliasFichier(int nIndex)
{
switch(nIndex)
{
case 0 : return "patient_parrain";
default: return null;
}
}


public int getIdWDR()
{
return com.masociete.sante.R.raw.req_parrain_patient_update;
}
public String getNomFichierWDR()
{
return "req_parrain_patient_update";
}
}
