def call(String folderName) {
    sh "mkdir -p ${folderName}"
    echo "Folder ${folderName} created"
}
