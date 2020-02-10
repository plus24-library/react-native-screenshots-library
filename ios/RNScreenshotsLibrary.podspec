
Pod::Spec.new do |s|
  s.name         = "RNScreenshotsLibrary"
  s.version      = "1.0.0"
  s.summary      = "RNScreenshotsLibrary"
  s.description  = <<-DESC
                  RNScreenshotsLibrary
                   DESC
  s.homepage     = ""
  s.license      = "MIT"
  # s.license      = { :type => "MIT", :file => "FILE_LICENSE" }
  s.author             = { "author" => "author@domain.cn" }
  s.platform     = :ios, "7.0"
  s.source       = { :git => "https://github.com/author/RNScreenshotsLibrary.git", :tag => "master" }
  s.source_files  = "RNScreenshotsLibrary/**/*.{h,m}"
  s.requires_arc = true


  s.dependency "React"
  #s.dependency "others"

end

  