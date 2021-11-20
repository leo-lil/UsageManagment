#####环境变量配置：
##日志
LOGGING_LEVEL:DEBUG 日志级别 默认
IMS_LOG_ON:true|false ims debug是否开
# LOGGER4J_LEVEL:debug,console 框架log4j日志级别+输出位置

##JSON格式化配置
TIME_ZONE:时间格式化时区 Asia/Shanghai
DATA_FORMAT:时间格式化 yyyy-MM-dd HH:mm:ss

##业务个性化 默认
TENATN_ID:21

#ts config 配置 必配
#DB
PUBLIC_DB_IP:10.1.249.117
PUBLIC_DB_PORT:4403
PUBLIC_DB_USERNAME:billing
PUBLIC_DB_PASSWORD:83f30df0d2f800fa2fc62a640a86bf94

BASE_DB_IP:10.1.234.15
BASE_DB_PORT:4403
BASE_DB_USERNAME:billing
BASE_DB_PASSWORD:fc8a036dc8797875d0ac0381e00deb91

BOSS_DB_IP:10.1.249.117
BOSS_DB_PORT:4403
BOSS_DB_USERNAME:billing
BOSS_DB_PASSWORD:83f30df0d2f800fa2fc62a640a86bf94

CDR_DB_IP:10.1.249.117
CDR_DB_PORT:4403
CDR_DB_USERNAME:billing
CDR_DB_PASSWORD:83f30df0d2f800fa2fc62a640a86bf94

#REDIS
REDIS_HOST:10.1.249.117
REDIS_PORT:6379
REDIS_PASSWD:''
#是否其余虚拟参数 必配 1启用 0不启用
USE_VIRTUAL_TIME

＃参数参考
"env": [
{"name": "USE_VIRTUAL_TIME","value": "0"}
,{"name": "LOGGING_LEVEL","value": "DEBUG"}
,{"name": "IMS_LOG_ON","value": "true"}
,{"name": "TIME_ZONE","value": "Asia/Shanghai"}
,{"name": "DATA_FORMAT","value": "yyyy-MM-dd HH:mm:ss"}
,{"name": "TENATN_ID","value": "21"}
,{"name": "PUBLIC_DB_IP","value": "10.1.249.117"}
,{"name": "PUBLIC_DB_PORT","value": "4403"}
,{"name": "PUBLIC_DB_USERNAME","value": "billing"}
,{"name": "PUBLIC_DB_PASSWORD","value": "83f30df0d2f800fa2fc62a640a86bf94"}
,{"name": "BASE_DB_IP","value": "10.1.234.15"}
,{"name": "BASE_DB_PORT","value": "4403"}
,{"name": "BASE_DB_USERNAME","value": "billing"}
,{"name": "BASE_DB_PASSWORD","value": "fc8a036dc8797875d0ac0381e00deb91"}
,{"name": "BOSS_DB_IP","value": "10.1.249.117"}
,{"name": "BOSS_DB_PORT","value": "4403"}
,{"name": "BOSS_DB_USERNAME","value": "billing"}
,{"name": "BOSS_DB_PASSWORD","value": "83f30df0d2f800fa2fc62a640a86bf94"}
,{"name": "CDR_DB_IP","value": "10.1.249.117"}
,{"name": "CDR_DB_PORT","value": "4403"}
,{"name": "CDR_DB_USERNAME","value": "billing"}
,{"name": "CDR_DB_PASSWORD","value": "83f30df0d2f800fa2fc62a640a86bf94"}
,{"name": "REDIS_HOST","value": "10.1.249.117"}
,{"name": "REDIS_PORT","value": "6379"}]
