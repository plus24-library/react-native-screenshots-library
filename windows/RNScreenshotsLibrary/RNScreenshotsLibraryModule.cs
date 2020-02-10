using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Screenshots.Library.RNScreenshotsLibrary
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNScreenshotsLibraryModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNScreenshotsLibraryModule"/>.
        /// </summary>
        internal RNScreenshotsLibraryModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNScreenshotsLibrary";
            }
        }
    }
}
