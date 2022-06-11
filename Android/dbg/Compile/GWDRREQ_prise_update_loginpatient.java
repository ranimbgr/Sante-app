/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Requête
 * Classe Android : REQ_prise_update_loginpatient
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



public class GWDRREQ_prise_update_loginpatient extends WDDescRequeteWDR
{
public String getNomLogique()
{
return "REQ_prise_update_loginpatient";
}
public String getCodeSQLOriginal()
{
return " UPDATE  Prises_medicaments SET Login_pt = {Paramaffectation#0}  WHERE   Prises_medicaments.Login_pt = {Paramcondition#1}";
}
public Requete initArbre() throws WDInvalidSQLException
{
Fichier fic_Prises_medicaments = new Fichier();
fic_Prises_medicaments.setNom("Prises_medicaments");
fic_Prises_medicaments.setAlias("Prises_medicaments");
Requete varReqUpdate = new Requete(3);
varReqUpdate.ajouterClause(fic_Prises_medicaments);
Set varSet = new Set();
Rubrique rub_Login_pt = new Rubrique();
rub_Login_pt.setNom("Prises_medicaments.Login_pt");
rub_Login_pt.setAlias("Login_pt");
rub_Login_pt.setNomFichier("Prises_medicaments");
rub_Login_pt.setAliasFichier("Prises_medicaments");
Parametre param_Paramaffectation = new Parametre();
param_Paramaffectation.setNom("Paramaffectation");
varSet.ajouterElement(rub_Login_pt);
varSet.ajouterElement(param_Paramaffectation);
varReqUpdate.ajouterClause(varSet);
Expression expr__ = new Expression(9, "=", "Prises_medicaments.Login_pt = {Paramcondition}");
Rubrique rub_Login_pt_1 = new Rubrique();
rub_Login_pt_1.setNom("Prises_medicaments.Login_pt");
rub_Login_pt_1.setAlias("Login_pt");
rub_Login_pt_1.setNomFichier("Prises_medicaments");
rub_Login_pt_1.setAliasFichier("Prises_medicaments");
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
case 0 : return "Prises_medicaments";
default: return null;
}
}
public String getAliasFichier(int nIndex)
{
switch(nIndex)
{
case 0 : return "Prises_medicaments";
default: return null;
}
}


public int getIdWDR()
{
return com.masociete.sante.R.raw.req_update_prise_login;
}
public String getNomFichierWDR()
{
return "req_update_prise_login";
}
}
