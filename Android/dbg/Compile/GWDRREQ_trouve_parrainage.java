/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Requête
 * Classe Android : REQ_trouve_parrainage
 * Date : 30/05/2022 10:25:12
 * Version de wdjava.dll  : 25.0.221.6
 */


package com.masociete.sante.wdgen;


import com.masociete.sante.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.database.hf.requete.parsing.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDRREQ_trouve_parrainage extends WDDescRequeteWDR
{
public String getNomLogique()
{
return "REQ_trouve_parrainage";
}
public String getCodeSQLOriginal()
{
return " SELECT  patient_parrain.Login_pr AS Login_pr,\t patient_parrain.Login_pt AS Login_pt  FROM  patient_parrain  WHERE   patient_parrain.Login_pr = {ParamLogin_pr#0} AND\tpatient_parrain.Login_pt = {ParamLogin_pt#1}";
}
public Requete initArbre() throws WDInvalidSQLException
{
Select varSelect = new Select();
varSelect.setType(1);
Rubrique rub_Login_pr = new Rubrique();
rub_Login_pr.setNom("Login_pr");
rub_Login_pr.setAlias("Login_pr");
rub_Login_pr.setNomFichier("patient_parrain");
rub_Login_pr.setAliasFichier("patient_parrain");
varSelect.ajouterElement(rub_Login_pr);
Rubrique rub_Login_pt = new Rubrique();
rub_Login_pt.setNom("Login_pt");
rub_Login_pt.setAlias("Login_pt");
rub_Login_pt.setNomFichier("patient_parrain");
rub_Login_pt.setAliasFichier("patient_parrain");
varSelect.ajouterElement(rub_Login_pt);
From varFrom = new From();
Fichier fic_patient_parrain = new Fichier();
fic_patient_parrain.setNom("patient_parrain");
fic_patient_parrain.setAlias("patient_parrain");
varFrom.ajouterElement(fic_patient_parrain);
Requete varReqSelect = new Requete(1);
varReqSelect.ajouterClause(varSelect);
varReqSelect.ajouterClause(varFrom);
Expression expr_AND = new Expression(24, "AND", "patient_parrain.Login_pr = {ParamLogin_pr}\r\n\tAND\tpatient_parrain.Login_pt = {ParamLogin_pt}");
Expression expr__ = new Expression(9, "=", "patient_parrain.Login_pr = {ParamLogin_pr}");
Rubrique rub_Login_pr_1 = new Rubrique();
rub_Login_pr_1.setNom("patient_parrain.Login_pr");
rub_Login_pr_1.setAlias("Login_pr");
rub_Login_pr_1.setNomFichier("patient_parrain");
rub_Login_pr_1.setAliasFichier("patient_parrain");
expr__.ajouterElement(rub_Login_pr_1);
Parametre param_ParamLogin_pr = new Parametre();
param_ParamLogin_pr.setNom("ParamLogin_pr");
expr__.ajouterElement(param_ParamLogin_pr);
expr_AND.ajouterElement(expr__);
Expression expr___1 = new Expression(9, "=", "patient_parrain.Login_pt = {ParamLogin_pt}");
Rubrique rub_Login_pt_1 = new Rubrique();
rub_Login_pt_1.setNom("patient_parrain.Login_pt");
rub_Login_pt_1.setAlias("Login_pt");
rub_Login_pt_1.setNomFichier("patient_parrain");
rub_Login_pt_1.setAliasFichier("patient_parrain");
expr___1.ajouterElement(rub_Login_pt_1);
Parametre param_ParamLogin_pt = new Parametre();
param_ParamLogin_pt.setNom("ParamLogin_pt");
expr___1.ajouterElement(param_ParamLogin_pt);
expr_AND.ajouterElement(expr___1);
Where varWhere = new Where();
varWhere.ajouterElement(expr_AND);
varReqSelect.ajouterClause(varWhere);
Limit varLimit = new Limit();
varLimit.setType(0);
varLimit.setNbEnregs(0);
varLimit.setOffset(0);
varReqSelect.ajouterClause(varLimit);
return varReqSelect;
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
return com.masociete.sante.R.raw.req_trouve_parrainage;
}
public String getNomFichierWDR()
{
return "req_trouve_parrainage";
}
}
