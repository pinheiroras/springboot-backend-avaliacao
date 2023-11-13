dbu
		docker build  -t java_app:1.0  .
dru
		docker run -d --name backend -p 8080:8080 java_app:1.0
