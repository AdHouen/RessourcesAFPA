#!/bin/sh
# Commande de création des bases de données
# Auteur : XH


if [ -n $ORACLE_HOME ]
then
  echo "Positionner la variable d'env. ORACLE_HOME"
  exit 1
fi


#rem  source des scripts de création
export SOURCE=.


#rem - lancement de SQL*Plus en mode ligne avec le script
$ORACLE_HOME/bin/sqlplus -S hr @"$SOURCE/go.sql"

exit 0
