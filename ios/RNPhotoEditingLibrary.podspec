
Pod::Spec.new do |s|
  s.name         = "RNPhotoEditingLibrary"
  s.version      = "1.0.0"
  s.summary      = "RNPhotoEditingLibrary"
  s.description  = <<-DESC
                  RNPhotoEditingLibrary
                   DESC
  s.homepage     = ""
  s.license      = "MIT"
  # s.license      = { :type => "MIT", :file => "FILE_LICENSE" }
  s.author             = { "author" => "author@domain.cn" }
  s.platform     = :ios, "7.0"
  s.source       = { :git => "https://github.com/author/RNPhotoEditingLibrary.git", :tag => "master" }
  s.source_files  = "RNPhotoEditingLibrary/**/*.{h,m}"
  s.requires_arc = true


  s.dependency "React"
  #s.dependency "others"

end

  