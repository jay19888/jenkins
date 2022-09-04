pipeline {
	agent any
	stages {
		stage{
			step {
				echo "hello world"
			}
		}
	}
}
