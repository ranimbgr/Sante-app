/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Requête
 * Classe Android : REQ_patient_parrain_update_loginpatient
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



public class GWDRREQ_patient_parrain_update_loginpatient extends WDDescRequeteWDR
{
public String getNomLogique()
{
return "REQ_patient_parrain_update_loginpatient";
}
public String getCodeSQLOriginal()
{
return " UPDATE  patient_parrain SET Login_pt = {Paramaffectation#0}  WHERE   patient_parrain.Login_pt = {Paramcondition#1}";
}
public Requete initArbre() throws WDInvalidSQLException
{
Fichier fic_patient_parrain = new Fichier();
fic_patient_parrain.setNom("patient_parrain");
fic_patient_parrain.setAlias("patient_parrain");
Requete varReqUpdate = new Requete(3);
varReqUpdate.ajouterClause(fic_patient_parrain);
Set varSet = new Set();
Rubrique rub_Login_pt = new Rubrique();
rub_Login_pt.setNom("patient_parrain.Login_pt");
rub_Login_pt.setAlias("Login_pt");
rub_Login_pt.setNomFichier("patient_parrain");
rub_Login_pt.setAliasFichier("patient_parrain");
Parametre param_Paramaffectation = new Parametre();
param_Paramaffectation.setNom("Paramaffectation");
varSet.ajouterElement(rub_Login_pt);
varSet.ajouterElement(param_Paramaffectation);
varReqUpdate.ajouterClause(varSet);
Expression expr__ = new Expression(9, "=", "patient_parrain.Login_pt = {Paramcondition}");
Rubrique rub_Login_pt_1 = new Rubrique();
rub_Login_pt_1.setNom("patient_parrain.Login_pt");
rub_Login_pt_1.setAlias("Login_pt");
rub_Login_pt_1.setNomFichier("patient_parrain");
rub_Login_pt_1.setAliasFichier("patient_parrain");
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
return com.masociete.sante.R.raw.req_update_patient_parrain;
}
public String getNomFichierWDR()
{
return "req_update_patient_parrain";
}
}
