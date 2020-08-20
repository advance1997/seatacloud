解压seata包
tar -zxvf seata-1.3.tar.gz
进入seata文件夹
cd seata/bin/
启动seata
./seata-server.sh -p 8091 -h {your host} -m file -n 1

即可启动seata Server