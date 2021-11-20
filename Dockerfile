FROM aijava8
ARG JAR_FILE
ADD ${JAR_FILE}  /usr/local/bin/app.jar
ENTRYPOINT exec java  -Delastic.apm.service_name=cdrapi -Delastic.apm.application_packages=com.ailk.openbilling.cdr -jar $JAVA_OPTIONS $APM_AGENT /usr/local/bin/app.jar $JAVA_PARAMS
