/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Requête
 * Classe Android : REQ_medicament_par_famille
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



public class GWDRREQ_medicament_par_famille extends WDDescRequeteWDR
{
public String getNomLogique()
{
return "REQ_medicament_par_famille";
}
public String getCodeSQLOriginal()
{
return " SELECT  medicament.nom_med AS nom_med,\t medicament.Nom_fam AS Nom_fam  FROM  medicament  WHERE   medicament.Nom_fam = {ParamNom_fam#0}";
}
public Requete initArbre() throws WDInvalidSQLException
{
Select varSelect = new Select();
varSelect.setType(1);
Rubrique rub_nom_med = new Rubrique();
rub_nom_med.setNom("nom_med");
rub_nom_med.setAlias("nom_med");
rub_nom_med.setNomFichier("medicament");
rub_nom_med.setAliasFichier("medicament");
varSelect.ajouterElement(rub_nom_med);
Rubrique rub_Nom_fam = new Rubrique();
rub_Nom_fam.setNom("Nom_fam");
rub_Nom_fam.setAlias("Nom_fam");
rub_Nom_fam.setNomFichier("medicament");
rub_Nom_fam.setAliasFichier("medicament");
varSelect.ajouterElement(rub_Nom_fam);
From varFrom = new From();
Fichier fic_medicament = new Fichier();
fic_medicament.setNom("medicament");
fic_medicament.setAlias("medicament");
varFrom.ajouterElement(fic_medicament);
Requete varReqSelect = new Requete(1);
varReqSelect.ajouterClause(varSelect);
varReqSelect.ajouterClause(varFrom);
Expression expr__ = new Expression(9, "=", "medicament.Nom_fam = {ParamNom_fam}");
Rubrique rub_Nom_fam_1 = new Rubrique();
rub_Nom_fam_1.setNom("medicament.Nom_fam");
rub_Nom_fam_1.setAlias("Nom_fam");
rub_Nom_fam_1.setNomFichier("medicament");
rub_Nom_fam_1.setAliasFichier("medicament");
expr__.ajouterElement(rub_Nom_fam_1);
Parametre param_ParamNom_fam = new Parametre();
param_ParamNom_fam.setNom("ParamNom_fam");
expr__.ajouterElement(param_ParamNom_fam);
Where varWhere = new Where();
varWhere.ajouterElement(expr__);
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
case 0 : return "medicament";
default: return null;
}
}
public String getAliasFichier(int nIndex)
{
switch(nIndex)
{
case 0 : return "medicament";
default: return null;
}
}


public int getIdWDR()
{
return com.masociete.sante.R.raw.req_medicament_famille;
}
public String getNomFichierWDR()
{
return "req_medicament_famille";
}
}
